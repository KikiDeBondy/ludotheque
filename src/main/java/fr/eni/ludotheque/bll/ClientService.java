package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Client;

import java.util.List;


public interface ClientService {

    List<Client> getClients();

    Client PostClient(Client client);

    void deleteClient(Long id);

}
