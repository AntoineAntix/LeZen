package com.esiea.tp4A.domain;

//Retour des déplacements du Rover:
//Remarque: le rover semble reculer face a son pole (ne change pas lors du recul).

//         <N>
//          |
//  <W>===ROVER===<E>
//          |
//         <S>


public enum Direction {

   
   
    //Orienté vers le nord sur sa position de départ:
    //tourne droite => face à <E>
    //tourne gauche => face à <W>
    NORTH{
        
        public Direction RightRotation() {
            return EAST;
        }

        public Direction LeftRotation() {
            return WEST;
        }

    },
    
    
    
    //Orienté vers l'Est sur sa position de départ:
    //tourne droite => face à <S>
    //tourne gauche => face à <N>
    EAST{
           
        public Direction RightRotation() {
            return SOUTH;
        }

        
        public Direction LeftRotation() {
            return NORTH;
        }

    }, 
   
   

    //Orienté vers le Sud sur sa position de départ:
    //tourne droite => face à <W>
    //tourne gauche => face à <E>
    SOUTH{
    
        public Direction RightRotation() {
            return WEST;
        }

        
        public Direction LeftRotation() {
            return EAST;
        }

    },
    


    //Orienté vers l'Ouest sur sa position de départ:
    //tourne droite => face à <N>
    //tourne gauche => face à <S>
     WEST{
    
        public Direction RightRotation() {
            return NORTH;
        }

        
        public Direction LeftRotation() {
            return SOUTH;
        }

    };



}
