package com.example.Apirestfull.Service.CommandeService;

import com.example.Apirestfull.Entity.Commande;
import org.springframework.stereotype.Service;

@Service
public interface CreerCommandeService {
    Commande creerCommande(Commande commande);
}
