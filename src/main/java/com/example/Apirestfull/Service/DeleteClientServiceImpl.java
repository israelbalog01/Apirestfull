package com.example.Apirestfull.Service;

import com.example.Apirestfull.Entity.Client;
import com.example.Apirestfull.Repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteClientServiceImpl {
    private final ClientRepository clientRepository;

    public DeleteClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void deleteClientById(int clientId) {
        clientRepository.deleteById(clientId);
    }
}
