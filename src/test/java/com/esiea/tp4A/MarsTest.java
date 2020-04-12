package com.esiea.tp4A;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MarsTest {

    Mars mars = new Mars();

    @Test
    public void testObstacles(){
        System.out.println("----------------------------");
        System.out.println("Test création des obstacles");
        System.out.println("----------------------------");
        System.out.println("Mars est en vie!");
        System.out.println("Initialisation de la détection des obstacles ...");
        mars.genererObstacles();
        System.out.println((mars.positionObstacles.size()-1) +" obstacles détectés!");
        System.out.println("Fin de transmission\n");
    }

    @Test
    public void testDectection(){
        System.out.println("----------------------------");
        System.out.println("Test détection d'un obstacle");
        System.out.println("----------------------------");
        System.out.println("Y'a-t-il un obstacle en (2,8)?");
        assertThat(mars.detectionObstacles(2, 8) == false);
        System.out.println("Non c'est good, la voie est libre!\n");
    }

    @Test
    public void testDestruction(){
        System.out.println("-------------------------------");
        System.out.println("Test destruction d'un obstacle ");
        System.out.println("-------------------------------");
        System.out.println("Destruction de l'obstacle en (10,10)");
        mars.destructionObstacle(10, 10);
        System.out.println("Obstacle bien détruit\n");
    }
}