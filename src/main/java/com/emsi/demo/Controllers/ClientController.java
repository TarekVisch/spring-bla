package com.emsi.demo.Controllers;

import com.emsi.demo.Models.Client;
import com.emsi.demo.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(path = "list")
    public List<Client> getClients() {
        return clientService.getClients();
    }
}