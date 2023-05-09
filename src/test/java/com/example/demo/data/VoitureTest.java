package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class VoitureTest {

@Test
void uneVoiture(){


// Créer une instance de Voiture
Voiture voiture = new Voiture();
VoitureRepository.save(voiture);


// Définir l'id de la voiture
int expectedId = 1;
voiture.setId(expectedId);

// Vérifier que l'id de la voiture est correctement défini
int actualId = voiture.getId();
assertEquals(expectedId, actualId);



@Test
public void testEquals() {
// Créer deux instances de Voiture avec le même id
Voiture voiture1 = new Voiture();
voiture1.setId(1);

Voiture voiture2 = new Voiture();
voiture2.setId(1);


assertTrue(voiture1.equals(voiture2));
assertTrue(voiture2.equals(voiture1));


voiture2.setId(2);


assertFalse(voiture1.equals(voiture2));
assertFalse(voiture2.equals(voiture1));
}

@Test
public void testHashCode() {
// Créer deux instances de Voiture avec le même id
Voiture voiture1 = new Voiture();
voiture1.setId(1);

Voiture voiture2 = new Voiture();
voiture2.setId(1);

// Vérifier que les deux voitures ont le même hashCode
assertEquals(voiture1.hashCode(), voiture2.hashCode());

// Modifier l'id de la deuxième voiture
voiture2.setId(2);

// Vérifier que les deux voitures ont des hashCodes différents
assertNotEquals(voiture1.hashCode(), voiture2.hashCode());
}

@Test
public void testToString() {
// Créer une instance de Voiture avec un id donné
Voiture voiture = new Voiture();
voiture.setId(1);

// Vérifier que la représentation sous forme de chaîne de caractères est correcte
String expectedToString = "Voiture{id=1}";
String actualToString = voiture.toString();
assertEquals(expectedToString, actualToString);

}

}
