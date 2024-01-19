package com.example.Apirestfull.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Commande")
@Data
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    private String nom;


    public Commande() {
    }

    public Commande(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
