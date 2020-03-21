
package dev.rjp.rpg.handler;

import dev.rjp.rpg.Game;

public class Handler {
    
    private int width, height;
    private Game game;
    
    public Handler(Game game){
        this.game = game;
    }
    
    public int getWidth() {
        return game.getWidth();
    }

    public int getHeight() {
        return game.getHeight();
    }
}
