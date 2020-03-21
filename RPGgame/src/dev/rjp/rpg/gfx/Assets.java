package dev.rjp.rpg.gfx;

import java.awt.image.BufferedImage;

public class Assets {
    
    public static BufferedImage playButton;
    public static BufferedImage playButtonBright;
    public static BufferedImage playButtonDark;
    
    public static BufferedImage helpButton;
    public static BufferedImage helpButtonBright;
    public static BufferedImage helpButtonDark;
    
    public static BufferedImage quitButton;
    public static BufferedImage quitButtonBright;
    public static BufferedImage quitButtonDark;

    public static void init(){
        
        playButton = Loader.loadImage("/textures/Play_Button.png");
        
    }
    
}

