package com.example.Apirestfull.Service.ClientService;

import com.example.Apirestfull.Entity.Client;
import com.example.Apirestfull.Repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteClientServiceImpl implements DeleteClientService{
    private final ClientRepository clientRepository;

    public DeleteClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public boolean deleteClient(int id) {
        Optional<Client> clientOptional = clientRepository.findById(id);

        if (clientOptional.isPresent()) {
            clientRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }}
// api response a faire