
package dev.rjp.rpg.states;

import dev.rjp.rpg.Game;
import java.awt.Graphics;

public class GameState extends State{
    
    public static boolean gameOver;

    public GameState(Game game){
        super(game);
        gameOver = false;
    }

    public void tick() {

        if(!gameOver){
       
        }
        else if(gameOver){

        }
    }
    public void render(Graphics g) {
        
        if(!gameOver){
            
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