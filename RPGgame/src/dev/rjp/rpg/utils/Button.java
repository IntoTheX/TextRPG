package dev.rjp.rpg.utils;

import dev.rjp.rpg.Game;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Button {
    
    private Game game;
    private int x, y, width, height, id;
    
    private BufferedImage normal;
    private BufferedImage bright;
    private BufferedImage dark;
    
    boolean play;
    
    private BufferedImage currentImage;
    
    public Button(int id, Game game, BufferedImage normal, BufferedImage bright, BufferedImage dark, int x, int y, int width, int height){
        this.game = game;
        
        this.normal = normal;
        this.bright = bright;
        this.dark = dark;
        
        this.width = width;
        this.height = height;
        
        this.x = x;
        this.y = y;
        this.id = id;
        currentImage = normal;
        play = false;
    }
 
    public void tick(){

        if(game.getMouseManager().getMx()>=x&&game.getMouseManager().getMy()>=y&&
           game.getMouseManager().getMx()<=(x+width)&&game.getMouseManager().getMy()<=(y+height)){
           setImage(bright);
            if(game.getMouseManager().isLeftPressed()){
                setImage(dark);
                play = true;
            }
            else if(game.getMouseManager().getMx()>=x&&game.getMouseManager().getMy()>=y&&
                    game.getMouseManager().getMx()<=(x+width)&&game.getMouseManager().getMy()<=(y+height)){
                
                if(play){
                    if(id == 1){
                        game.setGame();
                    }
                    else if(id == 2){
                    
                    }else if(id == 3){
                        System.exit(0);
                    }
                }
            }
        }
        else{
         setImage(normal);   
        }
    }
    
    public void render(Graphics g){
        g.drawImage(getCurrentImage(), x, y, width, height, null);
    }
    
    public void setImage(BufferedImage image){
        currentImage = image;
    }
    
    public BufferedImage getCurrentImage(){
        return currentImage;
    }
}
