package com.example.demo.service;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.Voiture;
import com.example.demo.data.VoitureRepository;

@Service
public class Statistique implements StatistiqueImpl {

    @Autowired
    VoitureRepository voitureRepository;

    public void ajouter(Voiture voiture) {
        voitureRepository.save(voiture);
    }

    public Echantillon prixMoyen() throws ArithmeticException{
        int prixTotal = 0;
        int nbrVoiture = 0;

        Iterator<Voiture> voitures = voitureRepository.findAll().iterator();

        while(voitures.hasNext()){

            prixTotal = prixTotal + voitures.next().getPrix();
            nbrVoiture++;

        }

        return new Echantillon(nbrVoiture, prixTotal/nbrVoiture);
    }

}