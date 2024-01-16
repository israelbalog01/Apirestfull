package com.example.Apirestfull.Entity;

public class Commande {
    private int id;
    private String nom;

    // Assume many-to-one relationship with Client
    private Client client;

    public Commande() {
    }

    public Commande(int id, String nom, Client client) {
        this.id = id;
        this.nom = nom;
        this.client = client;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
