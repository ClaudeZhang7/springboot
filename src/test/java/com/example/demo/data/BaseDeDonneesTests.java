package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;

import static org.mockito.Mockito.when;

@SpringBootTest
public class BaseDeDonneesTests {

    @MockBean
    private VoitureRepository voitureRepository;

    @Test
    void uneVoiture(){

        Voiture voiture = new Voiture(1, "Mercedes", 6666);

        when(voitureRepository.save(voiture)).thenReturn(voiture);

        when(voitureRepository.findById(1)).thenReturn(java.util.Optional.of(voiture));

        when(voitureRepository.findAll()).thenReturn(Collections.singletonList(voiture));

        voiture.setPrix(6667);
        when(voitureRepository.save(voiture)).thenReturn(voiture);

        voitureRepository.deleteById(1);
        when(voitureRepository.findById(1)).thenReturn(java.util.Optional.empty());
    }

    @Test
    void saveVoiture(){
        Voiture voiture = new Voiture(2, "Twingo", 23000);
        when(voitureRepository.save(voiture)).thenReturn(voiture);
    }

    @Test
    void findVoiture(){
        Voiture voiture = new Voiture(3, "Renault", 7000);
        when(voitureRepository.findById(3)).thenReturn(java.util.Optional.of(voiture));
    }

    @Test
    void updateVoiture(){
        Voiture voiture = new Voiture(5, "Tesla", 98659);
        voiture.setPrix(99999);
        when(voitureRepository.save(voiture)).thenReturn(voiture);
    }

    @Test
    void deleteVoiture(){
        Voiture voiture = new Voiture(9, "Tesla", 98659);
        voitureRepository.deleteById(9);
        when(voitureRepository.findById(9)).thenReturn(java.util.Optional.empty());
    }


}
