package com.example.Apirestfull.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "client")
@Data
public class Client  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    private String nom;

    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    private String prenom;

    @Column(nullable = false, columnDefinition = "DATE")
    private LocalDate datenaissance;

    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    private String email;


    public Client() {
    }

    public Client(int id, String nom, String prenom, LocalDate datenaissance, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = datenaissance;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(LocalDate datenaissance) {
        this.datenaissance = datenaissance;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
