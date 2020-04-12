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
    public void condAvancerX(){
        if((x < mars.maxX) && (mars.detectionObstacles(x+1,y) == false)) x=x+1;
        if((x == mars.maxX) && (mars.detectionObstacles(mars.minX,y) == false)) x=mars.minX;
    }

    //si il n'a pas atteint le maximum de la map sur l'axe Y et si il n'y a pas d'obstacle face à lui sa coordonnée y est incrémentée
    public void condAvancerY(){
        if((y < mars.maxY) && (mars.detectionObstacles(x,y+1) == false)) y=y+1;
        if((y == mars.maxY) && (mars.detectionObstacles(x,mars.minY) == false)) y=mars.minY;
    }

    //si il n'a pas atteint le minimum de la map sur l'axe X et si il n'y a pas d'obstacle derrière lui sa coordonnée x est décrémentée
    public void condReculerX(){
        if((x > mars.minX) && (mars.detectionObstacles(x-1,y) == false)) x=x-1;
        if((x == mars.minX) && (mars.detectionObstacles(mars.maxX,y) == false)) x=mars.maxX;
    }

    //si il n'a pas atteint le minimum de la map sur l'axe Y et si il n'y a pas d'obstacle derrière lui sa coordonnée y est décrémentée
    public void condReculerY(){
        if((y > mars.minY) && (mars.detectionObstacles(x,y-1) == false)) y=y-1;
        if((y == mars.minY) && (mars.detectionObstacles(x,mars.maxY) == false)) y=mars.maxY;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}