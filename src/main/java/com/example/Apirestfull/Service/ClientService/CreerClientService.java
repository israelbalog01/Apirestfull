package com.example.Apirestfull.Service.ClientService;

import com.example.Apirestfull.Entity.Client;
import org.springframework.stereotype.Service;

@Service
public interface CreerClientService {
    Client createClient(Client client);
}
