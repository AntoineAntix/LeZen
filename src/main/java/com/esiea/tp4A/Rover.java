package com.esiea.tp4A;

import com.esiea.tp4A.domain.Direction;
import com.esiea.tp4A.domain.MarsRover;
import com.esiea.tp4A.domain.Position;

// implémentation du déplacement

public class Rover implements MarsRover{
    
   public  Position RoverPosition; 
   public  Direction RoverDirection;


    //Constructeur
 public Rover(Position position, Direction direction){
   
    this.RoverPosition=position;
    this.RoverDirection=direction;
 }
   
  

  //Gestion du charactère entré au clavier
private void GetInputChar(char command){
   
   switch(command) {
      case 'f': //va tout droit
      case 'b': //recule
      case 'l': //va a gauche
      case 'r': //va a droite
  }
}
 




}