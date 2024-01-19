package com.example.Apirestfull.Repository;


import com.example.Apirestfull.Entity.Client;
import com.example.Apirestfull.Entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface CommandeRepository extends JpaRepository<Commande, Long> {
}