package com.example.Apirestfull.Service.CommandeService;

import com.example.Apirestfull.Entity.Commande;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {

    private final CreerCommandeService creerCommandeService;
    private final DeleteCommandeService deleteCommandeService;
    private final AfficherCommandeService afficherCommandeService;

    public CommandeServiceImpl(CreerCommandeService creerCommandeService, DeleteCommandeService deleteCommandeService, AfficherCommandeService afficherCommandeService) {
        this.creerCommandeService = creerCommandeService;
        this.deleteCommandeService = deleteCommandeService;
        this.afficherCommandeService = afficherCommandeService;
    }

    @Override
    public Commande afficherCommande(Long commandeId) {
        return afficherCommandeService.afficherCommande(commandeId);
    }

    @Override
    public List<Commande> afficherListeCommandes() {
        return afficherCommandeService.afficherListeCommandes();
    }


    @Override
    public Commande creerCommande(Commande commande) {
        return creerCommandeService.creerCommande(commande);
    }

    @Override
    public boolean supprimerCommande(Long id) {
        return deleteCommandeService.supprimerCommande(id);
    }
}
