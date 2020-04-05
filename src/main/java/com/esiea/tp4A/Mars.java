package com.esiea.tp4A;

import java.util.Set;
import java.util.Random;

import com.esiea.tp4A.domain.Direction;
import com.esiea.tp4A.domain.PlanetMap;
import com.esiea.tp4A.domain.Position;

public class Mars implements PlanetMap {
    public final int maxX;
    public final int minX;
    public final int maxY;
    public final int minY;
    public final int tabX[] = new int[15];
    public final int tabY[] = new int[15];
    public final Random random = new Random();
    public Set<Position> positionObstacles;

    public Mars() {
        this.maxX = 50;
        this.minX = -50;
        this.maxY = 50;
        this.minY = -50;
        this.genererObstacles();
    }

    public void genererObstacles(){
        for(int i=0; i<15; i++) {
			int randomIntP = random.nextInt(2);
			int randomIntN = random.nextInt(2);
			int randomInt2 = random.nextInt(51);
			int randomInt3 = random.nextInt(51);
			if(randomIntP == 0) randomInt2 = -randomInt2;
			if(randomIntN == 0) randomInt3 = -randomInt3;
			tabX[i] = randomInt2;
			tabY[i] = randomInt3;
        Position obstacle = new Position.FixedPosition(tabX[i], tabY[i], Direction.NORTH);
        positionObstacles.add(obstacle);
        }
    }

    public Set<Position> obstaclePositions() {
        return positionObstacles;
    }
}
