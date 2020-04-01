package dev.rjp.rpg.gfx;

import java.awt.image.BufferedImage;

public class Animation {
    private int index;
    private BufferedImage[] frames;
    
    private int speed;
    
    private long timer, LastTime;
    
    public Animation(int speed, BufferedImage[] frames){
        index = 0;
        this.frames = frames;
        this.speed = speed;
        
        LastTime = System.currentTimeMillis();
    }
    
    public void tick(){
        
        timer+=System.currentTimeMillis()-LastTime;
        LastTime = System.currentTimeMillis();
        
        if(timer>speed){
            
            index++;
            timer = 0;
            
            if(index>=frames.length){
                index = 0;
            }
        }
    }
    
    public BufferedImage getCurrentImage(){
        return frames[index];
    }
    
    public void addSpeed(int speed){
        this.speed -= speed;
    }
    
    public boolean isDone(){
        if(getCurrentImage()==frames[frames.length-1]){
            return true;
        }
        else{
            return false;
        }
    }
}
