package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {

    int id;

    String marque;

    int prix;

    public Voiture(){
    }

    public Voiture(int identifiant, String mark, int price) {
        this.id = identifiant;
        this.marque = mark;
        this.prix = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int identifiant) {
        this.id = identifiant;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String mark) {
        this.marque = mark;
    }

    public int getPrix() {
        return this.prix;
    }

    public void setPrix(int price) {
        this.prix = price;
    }

    public String toString(){
        return  "Id : " + this.id + "Marque : " + this.marque + "Prix : " + this.prix;
    }

}
