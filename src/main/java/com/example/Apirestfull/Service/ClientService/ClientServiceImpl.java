package com.example.Apirestfull.Service.ClientService;

import com.example.Apirestfull.Entity.Client;
import com.example.Apirestfull.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final CreerClientService creerClientService;
    private final DeleteClientService deleteClientService;
    private final AfficherClientService afficherClientService;

    @Autowired
    public ClientServiceImpl(CreerClientService creerClientService, DeleteClientService deleteClientService, AfficherClientService afficherClientService) {
        this.creerClientService = creerClientService;
        this.deleteClientService = deleteClientService;
        this.afficherClientService = afficherClientService;
    }

    @Override
    public Client createClient(Client client) {

        return creerClientService.createClient(client);
    }

    @Override
    public boolean deleteClient(int id) {
        return deleteClientService.deleteClient(id);
    }
    @Override
    public Client afficherClient(int clientId) {
        return afficherClientService.afficherClient(clientId);
    }

    @Override
    public List<Client> afficherListeClients() {
        return afficherClientService.afficherListeClients();
    }

}
