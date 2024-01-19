package com.example.Apirestfull.Service.CommandeService;

import com.example.Apirestfull.Entity.Commande;
import com.example.Apirestfull.Repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AfficherCommandeServiceImpl implements AfficherCommandeService {

    private final CommandeRepository commandeRepository;

    @Autowired
    public AfficherCommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public Commande afficherCommande(Long commandeId) {
        Optional<Commande> commandeOptional = commandeRepository.findById(commandeId);
        return commandeOptional.orElse(null);
    }

    @Override
    public List<Commande> afficherListeCommandes() {
        return commandeRepository.findAll();
    }
}
