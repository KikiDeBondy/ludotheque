package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Adress;
import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dal.ClientRepository;
import lombok.Builder;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;




import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@Slf4j
@SpringBootTest

public class ClientServiceImplTest {

    // Injection des mocks
    @Autowired
    private ClientService clientService;

    @MockitoBean
    private ClientRepository clientRepository;

    @Test
    @DisplayName("Test ajout client")
    public void clientServiceTest() {
        Long idClientRecherche = 99L;
        // Création d'une adresse
        Adress adress = Adress.builder()
                .city("Nantes")
                .postal_code("44000")
                .street("rue du port")
                .build();

        // Création du client
        Client nath = Client.builder()
                .name("Ked")
                .firstName("Nath")
                 .email("n.k@gmail.com")
                .adress(adress)
                .build();

        // Ce que dois faire le mock
        when(clientRepository.save(nath)).thenReturn(nath);

        Client client = clientService.PostClient(nath);

        assertThat(nath).isEqualTo(client);

        // Code 200

    }
}
