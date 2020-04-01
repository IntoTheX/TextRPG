
package dev.rjp.rpg.states;

import dev.rjp.rpg.Game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Storyline extends State{
    
    String[] story;
    private long timer, LastTime;
    int speed;
    private String renderedString;
    
    int a, b;

    public Storyline(Game game) {
        super(game);
        
        a = 0;
        b = 0;
       
        renderedString = "";
        story = new String[4];
        
        story[0]= "The land was once peaceful and every creature lived in harmony.";
        story[1]= "efksjfklsdjfkjslkafsafkljsdjflksdjfas";
        story[2]= "Tsdagdfgskajgklsjaglkjgkorejkjoa;erfg.";
        story[3]= " geagmnejkgjkejs ke aegf lkgkeglg jklednkanrl;aesf n k a lkjpl";
        
        speed = 40;
       
        LastTime = System.currentTimeMillis();
        
    }

    @Override
    public void tick(){
        
        if(b>=story[a].length()){
            a++;
            b=0;
        }
        
        timer += System.currentTimeMillis() - LastTime;
        LastTime = System.currentTimeMillis();        
        
        if(timer >= speed){
            
            System.out.println(story.length);
            
            renderedString = renderedString.concat(Character.toString(story[a].charAt(b)));
            b++;
            timer = 0;
        }
    }

    @Override
    public void render(Graphics g) {
        
        g.setFont(new Font("Nyala", Font.BOLD, 30));
        g.setColor(Color.BLACK);
        g.drawString(renderedString, 10, 30);         
    }
    
}
