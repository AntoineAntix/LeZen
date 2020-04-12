package com.esiea.tp4A;

public class Joueur {
    private Rover rover;
    private int numJ;

    public Joueur(Rover rover, int numJ){
        this.rover=rover;
        this.numJ=numJ;
    }

    public int getNumJ(){
        return numJ;
    }

    public Rover getRover(){
        return rover;
    }

}