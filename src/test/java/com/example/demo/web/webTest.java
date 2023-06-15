package com.example.demo.web;

import com.example.demo.service.Echantillon;
import com.example.demo.service.Statistique;
import com.example.demo.web.VoitureException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class VoitureControllerTest {

    @Mock
    private Statistique statistiqueImpl;

    private VoitureController voitureController;

    @BeforeEach
    void setUp() {
        // initialise le mock
        MockitoAnnotations.openMocks(this);
        voitureController = new VoitureController();
        voitureController.statistiqueImpl = statistiqueImpl;
    }

    @Test
    void testGetStatistiques() throws VoitureException {
        Echantillon echantillonMock = new Echantillon(2, 2000);
        when(statistiqueImpl.prixMoyen()).thenReturn(echantillonMock);

        Echantillon resultat = voitureController.getStatistiques();

        assertEquals(echantillonMock, resultat);
        verify(statistiqueImpl, times(1)).prixMoyen();
    }
}
