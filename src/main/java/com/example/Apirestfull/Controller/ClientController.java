package com.example.Apirestfull.Controller;

import com.example.Apirestfull.Entity.Client;
import com.example.Apirestfull.Service.ClientService.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client createdClient = clientService.createClient(client);
        return ResponseEntity.ok(createdClient);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("hello");
    }

    @DeleteMapping("/{clientId}")
    public ResponseEntity<String> deleteClientById(@PathVariable int clientId) {
        boolean deletionResult = clientService.deleteClient(clientId);
        if (deletionResult) {
            return new ResponseEntity<>("Client supprimé avec succès.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Aucun client avec cet ID n'a été trouvé.", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<?> getSingleClient(@PathVariable int clientId) {
        Client client = clientService.afficherClient(clientId);
        if (client != null) {
            return ResponseEntity.ok(client);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllClients() {
        List<Client> clients = clientService.afficherListeClients();
        if (!clients.isEmpty()) {
            return ResponseEntity.ok(clients);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
