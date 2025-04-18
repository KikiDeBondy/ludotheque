package fr.eni.ludotheque.controllers;

import fr.eni.ludotheque.bll.ClientService;
import fr.eni.ludotheque.bo.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@RestController
@RequestMapping("/api/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<Client>>> getAllClients() {
        List<Client> clients = clientService.getClients();

        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(new ApiResponse<>(true, "Client reçus", clients));
    }

    // Ajouter un client
    @PostMapping
    public ResponseEntity<ApiResponse<Client>> createClient(@RequestBody Client client) {

        Client newClient = clientService.PostClient(client);
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Client", "/api/client/" + newClient.getId())
                .body(new ApiResponse<>(true, "Client created", newClient));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Client>> deleteClient(@PathVariable(name = "id") Long id) {
        clientService.deleteClient(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Client deleted", null));
    }

}
