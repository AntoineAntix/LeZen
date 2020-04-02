package com.esiea.tp4A;

import java.util.Set;

import com.esiea.tp4A.domain.Direction;
import com.esiea.tp4A.domain.PlanetMap;
import com.esiea.tp4A.domain.Position;

public class Mars implements PlanetMap {
    public final int maxX;
    public final int minX;
    public final int maxY;
    public final int minY;
    public Set<Position> positionObstacles;

    public Mars() {
        this.maxX = 50;
        this.minX = -50;
        this.maxY = 50;
        this.minY = -50;
        this.genererObstacles();
    }

    public void genererObstacles(){
        Position obstacle = new Position.FixedPosition(5, 15, Direction.NORTH);
        positionObstacles.add(obstacle);
    }

    public Set<Position> obstaclePositions() {
        return positionObstacles;
    }
}
