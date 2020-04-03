package com.esiea.tp4A;

//conditions pour le mouvement du rover
public class CondMvt {
    public int x;
    public int y;
    public final Mars mars;

    //Constructeur
    public CondMvt(int x, int y, Mars mars){
        this.x=x;
        this.y=y;
        this.mars=mars;
    }

    //si il n'a pas atteint le maximum de la map sur l'axe X sa coordonnée x est incrémentée
    public void CondAvancerX(){
        if(x < mars.maxX) x=x+1;
    }

    //si il n'a pas atteint le maximum de la map sur l'axe Y sa coordonnée y est incrémentée
    public void CondAvancerY(){
        if(y < mars.maxY) y=y+1;
    }

    //si il n'a pas atteint le minimum de la map sur l'axe X sa coordonnée x est décrémentée
    public void CondReculerX(){
        if(x > mars.minX) x=x-1;
    }

    //si il n'a pas atteint le minimum de la map sur l'axe Y sa coordonnée y est décrémentée
    public void CondReculerY(){
        if(y > mars.minY) y=y-1;
    }
}