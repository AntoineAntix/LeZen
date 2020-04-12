package com.esiea.tp4A;

import com.esiea.tp4A.domain.MarsRover;

// implémentation du déplacement
public class Rover implements MarsRover{
    
   public final RoverMovment rMvt;
   public final Laser laser;

   //Constructeur
   public Rover(RoverMovment rMvt, Laser laser){
      this.rMvt=rMvt;
      //this.mars=mars;
      this.laser=laser;
   }

   //Effectue chaque commande du tableau de commandes
   public RoverMovment move(char[] commande){
      if(commande!=null){
         for(int i=0; i < commande.length; i++){
            getInputChar(commande[i]);
         }
      }
      return rMvt;
   }

//Gestion du charactère entré au clavier
private void getInputChar(char commande){
   switch(commande) {
      case 'f': rMvt.avancer(); //avance
         break;
      case 'b': rMvt.reculer(); //recule
         break;
      case 'l': rMvt.pivoterG(); //pivote a gauche
         break;
      case 'r': rMvt.pivoterD(); //pivote a droite
         break;
      case 's': laser.laseriser(rMvt.direction); //laser
         break;
  }
}


}
