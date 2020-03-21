
package dev.rjp.rpg.states;

import dev.rjp.rpg.Game;
import java.awt.Graphics;

public abstract class State {
    
    protected Game game;
    static State currentState;
    
    public State(Game game){
        this.game = game;
    }
    
    public abstract void tick();
    
    public abstract void render(Graphics g);
    
    public static State getCurrentState(){
        return currentState;
    }
    
    public static void setState(State state){
        currentState = state;
    }
    
}
