package com.esiea.tp4A;

import com.esiea.tp4A.domain.MarsRover;

// implémentation du déplacement
public class Rover implements MarsRover{
    
   public final RoverMovment rMvt;
   public final Mars mars;

   //Constructeur
   public Rover(RoverMovment rMvt, Mars mars){
      this.rMvt=rMvt;
      this.mars=mars;
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
      case 'f': rMvt.Avancer(); //avance
         break;
      case 'b': rMvt.Reculer(); //recule
         break;
      case 'l': rMvt.PivoterG(); //pivote a gauche
         break;
      case 'r': rMvt.PivoterD(); //pivote a droite
         break;
  }
}
 

}
