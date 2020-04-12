package com.esiea.tp4A;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.esiea.tp4A.domain.*;

public class RoverTest {

    Mars mars = new Mars();

    @Test
    public void testMvt(){
        int x = 0;
        int y = 0;
        Direction direction = Direction.NORTH;
        char[] commande = {'f','f'};
        System.out.println("Test Rover en cours ...");
        System.out.println("Initialisation du laser à (0,0) avec portée de 2 ...");
        Laser laser = new Laser(x,y,mars,2);
        System.out.println("Initialisation des conditions de mouvements ...");
        CondMvt condMvt = new CondMvt(x, y, mars);
        System.out.println("Initialisation des mouvements ...");
        RoverMovment rMvt = new RoverMovment(condMvt, direction);
        System.out.println("Initialisation du rover ...");
        Rover rover = new Rover(rMvt, laser);
        System.out.println("En attente de commande ...");
        rover.move(commande);
        System.out.println("Vérifications de la position après commande ...");
        assertThat(condMvt.getX()).isEqualTo(0);
        assertThat(condMvt.getY()).isEqualTo(2);
        assertThat(rMvt.gDirection()).isEqualTo(Direction.NORTH);
        System.out.println("Tout est OK");
    }

}