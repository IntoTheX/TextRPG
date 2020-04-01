
package dev.rjp.rpg.gfx;

import dev.rjp.rpg.Game;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class LogoAnimation {
    
    private BufferedImage logo;
    
    private long timer, LastTime;
    private int speed = 5000;
    
    private Game game;
    private boolean done;
    
    public LogoAnimation(Game game, BufferedImage image){
        logo = image;
        
        LastTime = System.currentTimeMillis();
        done = false;
        this.game = game;
    }
    
    public void tick(){
        if(!done){
        timer+=System.currentTimeMillis()-LastTime;
        LastTime = System.currentTimeMillis();
        
            if(timer>speed){
                done = true;
                timer = 0;
            }
        }
    }
    
    public void render(Graphics g){
        if(!done){
        //System.out.println(game.getWidth()+" "+game.getHeight());
            g.drawImage(logo, 0 ,0 , game.getWidth(), game.getHeight(), null);
        }
    }
    
    public boolean isDone(){
        return done;
    }
    public void setDone(boolean done){
        this.done = done;
    }
    
}
