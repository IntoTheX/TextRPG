
package dev.rjp.rpg.states;

import dev.rjp.rpg.Game;
import dev.rjp.rpg.gfx.Assets;
import dev.rjp.rpg.utils.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MenuState extends State{
    public int buttonWidth = 200;
    public int buttonHeight = 60;
    
    public Button playButton;
    public Button quitButton;
    public Button helpButton;

    public MenuState(Game game) {
        super(game);
        
        playButton = new Button(1, game, Assets.playButton, Assets.playButtonBright, Assets.playButtonDark,((game.getWidth()/2)-(buttonWidth/2)),
                ((game.getHeight()/2)-(buttonHeight/2))+50, buttonWidth, buttonHeight);
        
        helpButton = new Button(2, game, Assets.helpButton, Assets.helpButtonBright, Assets.helpButtonDark,((game.getWidth()/2)-(buttonWidth/2)),
                ((game.getHeight()/2)-(buttonHeight/2))+120, buttonWidth, buttonHeight);
        
        quitButton = new Button(3, game, Assets.quitButton, Assets.quitButtonBright, Assets.quitButtonDark,((game.getWidth()/2)-(buttonWidth/2)),
                ((game.getHeight()/2)-(buttonHeight/2))+190, buttonWidth, buttonHeight);
        
    }

    @Override
    public void tick() {
        playButton.tick();
        helpButton.tick();
        quitButton.tick();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.menu, 0, 0, game.getWidth(), game.getHeight(), null);
        
        g.setFont(new Font("Nyala", Font.BOLD, 150));
        g.setColor(Color.WHITE);
        
        g.drawImage(Assets.title, 30, 30, 1040, 300,null);
        playButton.render(g);
        helpButton.render(g);
        quitButton.render(g);
        
    }
}