
package dev.rjp.rpg.states;

import dev.rjp.rpg.Game;
import dev.rjp.rpg.entities.Player;
import java.awt.Graphics;

public class GameState extends State{
    
    public static boolean gameOver;
    private Player player;

    public GameState(Game game){
        super(game);
        gameOver = false;
        player = new Player(game, (game.getWidth()/2)-(60/2), 10, 2.0f);
    }

    public void tick() {

        if(!gameOver){
            player.tick();
        }
        else if(gameOver){

        }
    }
    public void render(Graphics g) {
        
        if(!gameOver){
            player.render(g);
        }
        else if(gameOver){

        
        }
    }
    
        
    public static void setGameOver(boolean gameOver){
        GameState.gameOver = gameOver;
    }
    
    public static boolean getGameOver(){
        return gameOver;
    }
}  