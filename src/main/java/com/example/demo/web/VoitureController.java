package com.example.demo.web;

import com.example.demo.data.Voiture;
import com.example.demo.service.Echantillon;
import com.example.demo.service.Statistique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VoitureController {
// ne pas oublier l'url
    @Autowired
    Statistique statistiqueImpl;
    @GetMapping("/bonjour")
    public String disBonjour(){
        return "Bonjour";
    }

    @GetMapping("/voiture")
    public Voiture getVoiture(){
        Voiture v = new Voiture();
        v.setId(1);
        return v;
    }

    @PostMapping("/voiture")
    public void creerVoiture(@RequestBody Voiture voiture) throws VoitureException {
        statistiqueImpl.ajouter(voiture);
    }

    @GetMapping("/statistique")
    public Echantillon getStatistiques() throws VoitureException {
        try{
            return statistiqueImpl.prixMoyen();
        } catch (ArithmeticException e) {
            throw new VoitureException();
        }

    }



}
