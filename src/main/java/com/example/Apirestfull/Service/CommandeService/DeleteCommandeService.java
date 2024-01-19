package com.example.Apirestfull.Service.CommandeService;

import org.springframework.stereotype.Service;

@Service
public interface DeleteCommandeService {
    boolean supprimerCommande(Long id);
}
