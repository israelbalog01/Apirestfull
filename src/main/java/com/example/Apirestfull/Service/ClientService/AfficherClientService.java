package com.example.Apirestfull.Service.ClientService;

import com.example.Apirestfull.Entity.Client;

import java.util.List;

public interface AfficherClientService {
    Client afficherClient(int clientId);
    List<Client> afficherListeClients();

}
