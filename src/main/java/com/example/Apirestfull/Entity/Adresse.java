package com.example.Apirestfull.Entity;

public class Adresse {
    private String Rue;
    private String codePostal;
    private int clientId;

    public Adresse() {
    }

    public Adresse(String rue, String codePostal, int clientId) {
        this.Rue = rue;
        this.codePostal = codePostal;
        this.clientId = clientId;
    }

    public String getRue() {
        return Rue;
    }

    public void setRue(String rue) {
        Rue = rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}
