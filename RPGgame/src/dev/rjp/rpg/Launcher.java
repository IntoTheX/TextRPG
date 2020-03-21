package dev.rjp.rpg;

public class Launcher {
    
    public static void main(String [] args){
        Game game = new Game("RPG", 1100, 700);
        game.start();
    }
}

