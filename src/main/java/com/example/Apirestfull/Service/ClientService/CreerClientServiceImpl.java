package com.example.Apirestfull.Service.ClientService;


import com.example.Apirestfull.Entity.Client;
import com.example.Apirestfull.Repository.ClientRepository;
import com.example.Apirestfull.Service.ClientService.CreerClientService;
import org.springframework.stereotype.Service;

@Service
public class CreerClientServiceImpl implements CreerClientService {

    private final ClientRepository clientRepository;

    public CreerClientServiceImpl(ClientRepository clientRepository) {

        this.clientRepository = clientRepository;
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }
}
