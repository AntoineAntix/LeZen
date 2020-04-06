package com.esiea.tp4A;

import com.esiea.tp4A.domain.Direction;

public class Laser{
    public int x;
    public int y;
    public final Mars mars;
    public final int range;

    public Laser(int x, int y, Mars mars, int range){
        this.x=x;
        this.y=y;
        this.mars=mars;
        this.range=range;
    }

    public void laseriser(Direction direction){
        switch(direction){
            case EAST: laseriserE(); break;
            case WEST: laseriserW(); break;
            case NORTH: laseriserN(); break;
            case SOUTH: laseriserS(); break;
        }
    }

    public void laseriserE(){
        for(int i=1; i<range+1; i++){
            if(mars.detectionObstacles(x+i, y)==true){
                mars.destructionObstacle(x+i, y);
            }
        }
    }

    public void laseriserW(){
        for(int i=1; i<range+1; i++){
            if(mars.detectionObstacles(x-i, y)==true){
                mars.destructionObstacle(x-i, y);
            }
        }
    }

    public void laseriserN(){
        for(int i=1; i<range+1; i++){
            if(mars.detectionObstacles(x, y+i)==true){
                mars.destructionObstacle(x, y+i);
            }
        } 
    }

    public void laseriserS(){
        for(int i=1; i<range+1; i++){
            if(mars.detectionObstacles(x, y-i)==true){
                mars.destructionObstacle(x, y-i);
            }
        } 
    }
}