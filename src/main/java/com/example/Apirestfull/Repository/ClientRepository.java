package com.example.Apirestfull.Repository;

import com.example.Apirestfull.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Integer> {
}