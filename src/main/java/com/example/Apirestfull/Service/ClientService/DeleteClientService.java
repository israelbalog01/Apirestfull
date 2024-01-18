package com.example.Apirestfull.Service.ClientService;

import org.springframework.stereotype.Service;

@Service
public interface DeleteClientService {
    boolean deleteClient(int id);
}
