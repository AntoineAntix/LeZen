package com.esiea.tp4A;

import java.util.Set;
import java.util.Random;

import com.esiea.tp4A.domain.Direction;
import com.esiea.tp4A.domain.PlanetMap;
import com.esiea.tp4A.domain.Position;

public class Mars implements PlanetMap {
    public final int maxX = 50;
    public final int minX = -50;
    public final int maxY = 50;
    public final int minY = -50;
    public Set<Position> positionObstacles;

    public Mars() {

    }

    //générer 15 obstacles avec des x et y aléatoires
    public void genererObstacles(){
        int tabX[] = new int[15];
        int tabY[] = new int[15];
        Random random = new Random();
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
    //check si il y a des obstacles aux x et y entrés en paramètres
    public boolean detectionObstacles(int x, int y) {
        boolean answer = positionObstacles.stream().anyMatch(obstacle
         -> obstacle.getX() == x && obstacle.getY() == y);
        return answer;
    }

    public void destructionObstacle(int x, int y){
        positionObstacles.removeIf(obstacle -> (obstacle.getX() == x && obstacle.getY() == y));
    }

    public Set<Position> obstaclePositions() {
        return positionObstacles;
    }
}
