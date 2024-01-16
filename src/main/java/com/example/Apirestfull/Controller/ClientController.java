package com.example.Apirestfull.Controller;





import com.example.Apirestfull.Entity.Client;
import com.example.Apirestfull.Service.ClientService.CreerClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class ClientController {

    private final CreerClientService clientService;

    @Autowired
    public ClientController(CreerClientService clientService) {

        this.clientService = clientService;
    }

    @PostMapping("/create")
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client createdClient = clientService.createClient(client);
        return ResponseEntity.ok(createdClient);
    }
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("hello");
    }

}

