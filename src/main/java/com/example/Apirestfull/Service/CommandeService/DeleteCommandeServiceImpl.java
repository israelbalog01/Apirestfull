package com.example.Apirestfull.Service.CommandeService;

import com.example.Apirestfull.Entity.Commande;
import com.example.Apirestfull.Repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteCommandeServiceImpl implements DeleteCommandeService {

    private final CommandeRepository commandeRepository;

    @Autowired
    public DeleteCommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public boolean supprimerCommande(Long id) {
        Optional<Commande> commandeOptional = commandeRepository.findById(id);
        if (commandeOptional.isPresent()) {
            commandeRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
