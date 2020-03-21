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
    
    public static BufferedImage menu;
    public static void init(){
        
        playButton = Loader.loadImage("/textures/Play_Button.png");
        playButtonBright = Loader.loadImage("/textures/Play_Button_Bright.png");
        playButtonDark = Loader.loadImage("/textures/Play_Button_Dark.png");
              
        quitButton = Loader.loadImage("/textures/Quit_Button.png");
        quitButtonBright = Loader.loadImage("/textures/Quit_Button_Bright.png");
        quitButtonDark = Loader.loadImage("/textures/Quit_Button_Dark.png");
              
        helpButton = Loader.loadImage("/textures/Help_Button.png");
        helpButtonBright = Loader.loadImage("/textures/Help_Button_Bright.png");
        helpButtonDark = Loader.loadImage("/textures/Help_Button_Dark.png");
        
        menu = Loader.loadImage("/textures/Dark_Dungeon.png");
        
        
    }
    
}

