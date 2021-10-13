package model;

import java.awt.*;

public class Athlete {

    private int x;
    private int health;
    public static final int Y = 600;
    public static final int SIZE = 50;
    public static final int MOVE_SIZE = 5;
    public static final int MAX_LIVES = 3;
    public static final int REDUCE_HEALTH = 1;

    public Athlete(int x) {
        this.x = x;
        this.health = MAX_LIVES;
    }

    public void moveLeft() {
        if(x - MOVE_SIZE > 0){
            x -= MOVE_SIZE;
        }
    }

    public void moveRight() {
        if(x + (SIZE) + (MOVE_SIZE * 4) < Game.MAP_SIZE){
            x += MOVE_SIZE;
        }
    }

    public boolean checkCollision(Hurdle hurdle){
        Rectangle heroRec = new Rectangle(x, Y, SIZE, SIZE);
        return heroRec.intersects(new Rectangle(hurdle.getX(), hurdle.getY(), hurdle.SIZE, hurdle.SIZE)) && hurdle.isTapping();
    }

    public void reduceHealth(){
        this.health -= REDUCE_HEALTH;
    }

    public int getHealth() {
        return health;
    }

    public int getX() {
        return this.x;
    }

    public boolean isDead(){
        return health <= 0;
    }
}
