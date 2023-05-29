package com.example.testconnection;

import com.example.testconnection.entities.Client;
import com.example.testconnection.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestConnectionApplication implements CommandLineRunner {

    @Autowired
    private ClientRepo service;

    public static void main(String[] args) {
        SpringApplication.run(TestConnectionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        for (int i = 0; i < 5 ; i++) {

            Client client = new Client();
            client.setFirstName("hamza");
            client.setLastName("bekkaoui");
            client.setAdresse("adresse");
            client.setPhoneNumber("phone number");
            client.setMail("mail");
            service.save(client);

        }

    }
}
