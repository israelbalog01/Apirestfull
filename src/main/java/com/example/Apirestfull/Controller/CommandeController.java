package com.example.Apirestfull.Controller;

import com.example.Apirestfull.Entity.Commande;
import com.example.Apirestfull.Service.CommandeService.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commande")
public class    CommandeController {

    private final CommandeService commandeService;

    @Autowired
    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @PostMapping
    public ResponseEntity<Commande> creerCommande(@RequestBody Commande commande) {
        Commande createdCommande = commandeService.creerCommande(commande);
        return ResponseEntity.ok(createdCommande);
    }

    @GetMapping("/{commandeId}")
    public ResponseEntity<?> afficherCommande(@PathVariable Long commandeId) {
        Commande commande = commandeService.afficherCommande(commandeId);
        if (commande != null) {
            return ResponseEntity.ok(commande);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/all")
    public ResponseEntity<List<Commande>> afficherListeCommandes() {
        List<Commande> commandes = commandeService.afficherListeCommandes();
        if (!commandes.isEmpty()) {
            return ResponseEntity.ok(commandes);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{commandeId}")
    public ResponseEntity<String> supprimerCommande(@PathVariable Long commandeId) {
        boolean deletionResult = commandeService.supprimerCommande(commandeId);
        if (deletionResult) {
            return new ResponseEntity<>("Commande supprimée avec succès.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Aucune commande avec cet ID n'a été trouvée.", HttpStatus.NOT_FOUND);
        }
    }
}
