package com.esiea.tp4A;

import com.esiea.tp4A.domain.Direction;
import com.esiea.tp4A.domain.MarsRover;
import com.esiea.tp4A.domain.Position;

// implémentation du déplacement

public class Rover implements MarsRover{
    
   public Position roverPosition;
   public Direction roverDirection;


   //Constructeur
   public Rover(){
      roverPosition = Position.of(0, 0, Direction.NORTH);
      roverDirection = roverPosition.getDirection();
   }

//Gestion du charactère entré au clavier
private void GetInputChar(char commande){
   switch(commande) {
      case 'f': //va tout droit
         break;
      case 'b': //recule
         break;
      case 'l': //va a gauche
         break;
      case 'r': //va a droite
         break;
  }
}
 

}
