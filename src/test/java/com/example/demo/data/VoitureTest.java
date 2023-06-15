package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        Voiture v1 = new Voiture(1, "Mercedes", 666);
        Assert.isInstanceOf(Voiture.class, v1);

        Assert.hasLength(v1.getMarque(), "Marque ne doit pas etre vide");
        Assert.isTrue(v1.getId()>=1, "Id doit etre superieur a 1");
        Assert.isTrue(v1.getPrix()>=200, "Prix doit etre superieur a 0");
    }

    @Test
    void voitureNotNull(){
        Voiture v1 = new Voiture(1, "Mercedes", 666);

        Assert.notNull(v1.getClass(), "La classe ne doit pas etre null");
        Assert.notNull(v1.getMarque(), "La marque ne doit pas etre null");
        Assert.notNull(v1.getId(), "L'id ne doit pas etre null");
        Assert.notNull(v1.getPrix(), "Le prix ne doit pas etre null");
    }


}
