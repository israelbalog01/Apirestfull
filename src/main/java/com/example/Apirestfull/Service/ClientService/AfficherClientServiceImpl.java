package com.example.Apirestfull.Service.ClientService;

import com.example.Apirestfull.Entity.Client;
import com.example.Apirestfull.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AfficherClientServiceImpl implements AfficherClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public AfficherClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client afficherClient(int clientId) {
        Optional<Client> clientOptional = clientRepository.findById(clientId);
        return clientOptional.orElse(null);
    }

    @Override
    public List<Client> afficherListeClients() {
        return clientRepository.findAll();
    }
}
