package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dal.ClientRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client PostClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        if (!clientRepository.existsById(id)) {
            throw new EntityNotFoundException("Client avec l'id " + id + " n'existe pas.");
        }
        clientRepository.deleteById(id);
    }

}
