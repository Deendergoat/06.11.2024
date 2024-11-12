package clocks;

import actions.Collisions;
import game.Snake;

public class GameClock extends Thread{
    public static boolean running = true;

    public void run(){
        while(running) {
            try {
                sleep(200);
                Snake.move();
                Snake.waitToMove = false;
                Collisions.collidePickUp();
                if(Collisions.collideSelf()){
                    Snake.tails.clear();
                    Snake.score = 0;
                }
                if(Collisions.collideWall()){
                    Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                    Snake.score = 0;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
