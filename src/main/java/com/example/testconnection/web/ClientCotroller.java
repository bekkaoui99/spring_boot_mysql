package com.example.testconnection.web;

import com.example.testconnection.entities.Client;
import com.example.testconnection.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientCotroller {


    @Autowired
    private ClientRepo service;

    @GetMapping(path = "/client")
    public List<Client> clientList(){
        return service.findAll();
    }
}
