package com.esiea.tp4A;

import com.esiea.tp4A.domain.*;

//Mouvements du Rover
public class RoverMovment implements MarsRover{

    public int x; 
    public int y;
    public Direction direction;

//Constructeur
    public RoverMovment(int x, int y, Direction direction) {
        this.x=x;
        this.y=y;
        this.direction=direction;  
    }

//Gérer les 4 mouvements 
    public void Avancer(){
        switch (direction){
            case NORTH: break;
            case SOUTH: break;
            case WEST: break;
            case EAST: break;
        }
    }

    public void Reculer(){
        switch (direction){
            case NORTH: break;
            case SOUTH: break;
            case WEST: break;
            case EAST: break;
        }
    }

    public void PivoterG(){
        switch (direction){
            case NORTH: break;
            case SOUTH: break;
            case WEST: break;
            case EAST: break;
        }
    }

    public void PivoterD(){
        switch (direction){
            case NORTH: break;
            case SOUTH: break;
            case WEST: break;
            case EAST: break;
        }
    }

}