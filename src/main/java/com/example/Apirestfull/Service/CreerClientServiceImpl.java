package com.example.Apirestfull.Service;


import com.example.Apirestfull.Entity.Client;
import com.example.Apirestfull.Repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class CreerClientServiceImpl implements CreerClientService {

    private final ClientRepository clientRepository;

    public CreerClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client createClient(Client client) {
        // Ajoutez ici la logique de création du client, si nécessaire
        return clientRepository.save(client);
    }
}
