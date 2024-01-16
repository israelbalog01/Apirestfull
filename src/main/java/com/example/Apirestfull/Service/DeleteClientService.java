package com.example.Apirestfull.Service;

import com.example.Apirestfull.Entity.Client;
import org.springframework.stereotype.Service;

@Service
public interface DeleteClientService {
    Client deleteClient(Client client);
}



