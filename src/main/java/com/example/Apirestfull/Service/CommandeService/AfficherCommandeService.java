package com.example.Apirestfull.Service.CommandeService;

import com.example.Apirestfull.Entity.Commande;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AfficherCommandeService {
    Commande afficherCommande(Long commandeId);
    List<Commande> afficherListeCommandes();
}
