
package dev.rjp.rpg.entities;

import dev.rjp.rpg.Game;
import java.awt.Graphics;

abstract class Entity {
    
    protected Game game;
    protected float x, y, speed;
    
    public Entity(Game game, float x, float y, float speed){
        this.game = game;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }
    
    
    abstract public void tick();
    abstract public void render(Graphics g);
    
}
