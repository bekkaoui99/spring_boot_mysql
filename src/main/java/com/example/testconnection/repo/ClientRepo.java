package com.example.testconnection.repo;

import com.example.testconnection.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client , Long> {
}
