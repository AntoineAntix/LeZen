package com.esiea.tp4A;

import com.esiea.tp4A.domain.*;

//Mouvements du Rover
public class RoverMovment implements MarsRover{

    public final CondMvt mvt;
    public Direction direction;

    //Constructeur
    public RoverMovment(CondMvt mvt, Direction direction) {
        this.mvt=mvt;
        this.direction=direction;  
    }

//Gérer les 4 mouvements 
    //avancer dans la direction du rover
    public void avancer(){
        switch (direction){
            case NORTH: mvt.condAvancerY(); break;
            case SOUTH: mvt.condReculerY(); break;
            case WEST: mvt.condReculerX(); break;
            case EAST: mvt.condAvancerX(); break;
        }
    }
    //reculer (avancer dans la direction opposée du rover)
    public void reculer(){
        switch (direction){
            case NORTH: mvt.condReculerY(); break;
            case SOUTH: mvt.condAvancerY(); break;
            case WEST: mvt.condAvancerX(); break;
            case EAST: mvt.condReculerX(); break;
        }
    }
    //pivoter le rover vers la gauche
    public void pivoterG(){
        switch (direction){
            case NORTH: direction=Direction.WEST; break;
            case SOUTH: direction=Direction.EAST; break;
            case WEST: direction=Direction.SOUTH; break;
            case EAST: direction=Direction.NORTH; break;
        }
    }
    //pivoter le rover vers la droite
    public void pivoterD(){
        switch (direction){
            case NORTH: direction=Direction.EAST; break;
            case SOUTH: direction=Direction.WEST; break;
            case WEST: direction=Direction.NORTH; break;
            case EAST: direction=Direction.SOUTH; break;
        }
    }

}