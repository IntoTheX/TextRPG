
package dev.rjp.rpg.states;

import dev.rjp.rpg.Game;
import dev.rjp.rpg.gfx.Animation;
import dev.rjp.rpg.gfx.Assets;
import java.awt.Graphics;

public class LoadingScreen extends State{
    Animation load;

    public LoadingScreen(Game game) {
        super(game);
        load = new Animation(40, Assets.intoTheXLoad);
     }
    @Override
    public void tick() {
        if(load.isDone()){
            game.setGame();
        }
        load.tick();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(load.getCurrentImage(), 0, 0, game.getWidth(), game.getHeight(), null);
    }
    
    public void shiftImage(){
        
    }
}
