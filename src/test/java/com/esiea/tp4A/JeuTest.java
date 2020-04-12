package com.esiea.tp4A;

import org.junit.jupiter.api.Test;

public class JeuTest {
    Jeu jeu = new Jeu();

    @Test
    public void testJeu(){
        System.out.println("--------");
        System.out.println("Test Jeu");
        System.out.println("--------");
        System.out.println("création du jeu ...");
        jeu.creationJeu();
        System.out.println("OK\n");
    }

}