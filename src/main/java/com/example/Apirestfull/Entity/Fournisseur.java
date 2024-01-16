package com.example.Apirestfull.Entity;

public class Fournisseur {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumtel() {
        return numtel;
    }

    public void setNumtel(int numtel) {
        this.numtel = numtel;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    public Fournisseur(int id, int numtel, int nom) {
        this.id = id;
        this.numtel = numtel;
        this.nom = nom;
    }

    private int id;
    private int numtel;
    private int nom;

    public Fournisseur() {
    }
}

