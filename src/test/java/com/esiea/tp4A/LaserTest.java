package com.esiea.tp4A;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.esiea.tp4A.domain.*;

public class LaserTest {
    Mars mars = new Mars();

    @Test
    public void testLaserisation(){
        int x = 10;
        int y = 8;
        Direction direction = Direction.NORTH;
        System.out.println("------------------------------");
        System.out.println("Test Laser");
        System.out.println("------------------------------");
        System.out.println("Initialisation du laser à (10,8) avec portée de 2 ...");
        Laser laser = new Laser(x,y,mars,2);
        System.out.println("Vérification de la présence de l'obstacle en (10,10)");
        assertThat(mars.detectionObstacles(10, 10) == true);
        System.out.println("Obstacle bien présent ... Prêt à faire feu!");
        laser.laseriser(direction);
        System.out.println("Tir effectué");
        System.out.println("Vérifications de la destruction de l'obstacle ...");
        assertThat(mars.detectionObstacles(10, 10) == false);
        System.out.println("OK\n");
    }
}