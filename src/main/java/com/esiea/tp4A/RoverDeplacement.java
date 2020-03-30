package com.esiea.tp4A;

import com.esiea.tp4A.domain.Direction;
import com.esiea.tp4A.domain.Position;

// implémentation du déplacement

public class RoverDeplacement{
    public Position position; 
    public Direction direction;

    //Le constructeur doit prendre en entrée la position initiale du rover, des coordonnées et la direction à laquelle il fait face (x, y, D).
 public RoverDeplacement(Position position, Direction direction){
   
    this.position=position;
    this.direction=direction;

 }




}