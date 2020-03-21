package dev.rjp.rpg.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Loader {
     public static BufferedImage loadImage(String path){
         
        try {
            return ImageIO.read(Loader.class.getResource(path));
        } catch (IOException e) {
            System.exit(1);
      }
        return null;
    }
}