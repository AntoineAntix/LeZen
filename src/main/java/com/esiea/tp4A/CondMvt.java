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

    //si il n'a pas atteint le maximum de la map sur l'axe X et si il n'y a pas d'obstacle face à lui sa coordonnée x est incrémentée
    public void CondAvancerX(){
        if((x < mars.maxX) && (mars.detectionObstacles(x+1,y) == false)) x=x+1;
    }

    //si il n'a pas atteint le maximum de la map sur l'axe Y et si il n'y a pas d'obstacle face à lui sa coordonnée y est incrémentée
    public void CondAvancerY(){
        if((y < mars.maxY) && (mars.detectionObstacles(x,y+1) == false)) y=y+1;
    }

    //si il n'a pas atteint le minimum de la map sur l'axe X et si il n'y a pas d'obstacle derrière lui sa coordonnée x est décrémentée
    public void CondReculerX(){
        if((x > mars.minX) && (mars.detectionObstacles(x-1,y) == false)) x=x-1;
    }

    //si il n'a pas atteint le minimum de la map sur l'axe Y et si il n'y a pas d'obstacle derrière lui sa coordonnée y est décrémentée
    public void CondReculerY(){
        if((y > mars.minY) && (mars.detectionObstacles(x,y-1) == false)) y=y-1;
    }
}