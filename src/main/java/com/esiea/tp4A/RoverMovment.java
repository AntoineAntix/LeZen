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
    public void Avancer(){
        switch (direction){
            case NORTH: mvt.CondAvancerY(); break;
            case SOUTH: mvt.CondReculerY(); break;
            case WEST: mvt.CondReculerX(); break;
            case EAST: mvt.CondAvancerX(); break;
        }
    }
    //reculer (avancer dans la direction opposée du rover)
    public void Reculer(){
        switch (direction){
            case NORTH: mvt.CondReculerY(); break;
            case SOUTH: mvt.CondAvancerY(); break;
            case WEST: mvt.CondAvancerX(); break;
            case EAST: mvt.CondReculerX(); break;
        }
    }
    //pivoter le rover vers la gauche
    public void PivoterG(){
        switch (direction){
            case NORTH: direction=Direction.WEST; break;
            case SOUTH: direction=Direction.EAST; break;
            case WEST: direction=Direction.SOUTH; break;
            case EAST: direction=Direction.NORTH; break;
        }
    }
    //pivoter le rover vers la droite
    public void PivoterD(){
        switch (direction){
            case NORTH: direction=Direction.EAST; break;
            case SOUTH: direction=Direction.WEST; break;
            case WEST: direction=Direction.NORTH; break;
            case EAST: direction=Direction.SOUTH; break;
        }
    }

}