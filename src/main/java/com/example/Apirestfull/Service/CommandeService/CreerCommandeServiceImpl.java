package com.example.Apirestfull.Service.CommandeService;

import com.example.Apirestfull.Entity.Commande;
import com.example.Apirestfull.Repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreerCommandeServiceImpl implements CreerCommandeService {

    private final CommandeRepository commandeRepository;

    @Autowired
    public CreerCommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public Commande creerCommande(Commande commande) {
        return commandeRepository.save(commande);
    }
}
