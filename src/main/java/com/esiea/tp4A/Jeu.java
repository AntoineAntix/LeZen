package com.esiea.tp4A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.esiea.tp4A.domain.Direction;
import com.esiea.tp4A.domain.Position;

public class Jeu {
    public Set<Position> positionJoueurs = new HashSet<>();
    public List<Joueur> liste = new ArrayList<>();

    public Jeu(){

    }

    public void creationJeu(){
        Mars mars = new Mars();
        mars.genererObstacles();
        mars.obstaclePositions();
        genererJoueurs(mars);
        joueurPositions();
    }

    public void genererJoueurs(Mars mars) {
        final int numJ[] = new int[50];
        final int tabX[] = new int[50];
        final int tabY[] = new int[50];
        final Random random = new Random();
        for(int i=0; i<50; i++) {
			int randomIntP = random.nextInt(2);
			int randomIntN = random.nextInt(2);
			int randomInt2 = random.nextInt(51);
			int randomInt3 = random.nextInt(51);
			if(randomIntP == 0) randomInt2 = -randomInt2;
            if(randomIntN == 0) randomInt3 = -randomInt3;
            numJ[i]= i+1;
			tabX[i] = randomInt2;
			tabY[i] = randomInt3;
        Position posJ = new Position.FixedPosition(tabX[i], tabY[i], Direction.NORTH);
        Laser laser = new Laser(tabX[i], tabY[i], mars, 5);
        CondMvt condMvt = new CondMvt(tabX[i], tabY[i], mars);
        RoverMovment rMvt = new RoverMovment(condMvt, posJ.getDirection());
        Rover rover = new Rover(rMvt,laser);
        Joueur joueur = new Joueur(rover,numJ[i]);
        positionJoueurs.add(posJ);
        liste.add(joueur);
        }
    }
    
    public Set<Position> joueurPositions() {
        return positionJoueurs;
    }
}