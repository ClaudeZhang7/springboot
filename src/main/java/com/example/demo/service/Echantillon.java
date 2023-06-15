package com.example.demo.service;

public class Echantillon {

    int nbrVoitures;
    int prixMoyen;

    public Echantillon(){}

    public Echantillon(int nVoitures, int priceMoyen) {
        this.nbrVoitures = nVoitures;
        this.prixMoyen = priceMoyen;
    }

    public int getNbrVoitures() {
        return this.nbrVoitures;
    }

    public void setNbrVoitures(int nVoitures) {
        this.nbrVoitures = nVoitures;
    }

    public int getPrixMoyen() {
        return this.prixMoyen;
    }

    public void setPrixMoyen(int priceMoyen) {
        this.prixMoyen = priceMoyen;
    }

    public String toString(){
        return "nombres Voitures : "+this.nbrVoitures + "prix moyen :"+this.prixMoyen;
    }

}

