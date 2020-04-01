
package dev.rjp.rpg.entities;

import dev.rjp.rpg.Game;
import dev.rjp.rpg.gfx.Animation;
import dev.rjp.rpg.gfx.Assets;
import java.awt.Graphics;

public class Player extends Entity{
    private Animation head;
    private Animation body;
    private Animation arm;
    private Animation leg;
    
    public Player(Game game, float x, float y, float speed){
        super(game, x, y, speed);
        
        head = new Animation(100, Assets.defaultPlayerHeadDown);
        body = new Animation(100, Assets.defaultPlayerBodyDown);
        arm = new Animation(100, Assets.defaultPlayerArmDown);
        leg = new Animation(100, Assets.defaultPlayerLegDown);
    }
    
    @Override
    public void tick(){
        if(game.getKeyManager().left){
            if(game.getKeyManager().left&&game.getKeyManager().up){
                x-=speed;
                y-=speed;
                head.tick();
                body.tick();
                arm.tick();
                leg.tick();
            }
            else if(game.getKeyManager().left&&game.getKeyManager().down){
                x-=speed;
                y+=speed;
                head.tick();
                body.tick();
                arm.tick();
                leg.tick();
            }
            else{
                x-=speed;
                head.tick();
                body.tick();
                arm.tick();
                leg.tick();
            }
        }
        else if(game.getKeyManager().right){
            if(game.getKeyManager().right&&game.getKeyManager().up){
                x+=speed;
                y-=speed;
                head.tick();
                body.tick();
                arm.tick();
                leg.tick();
            }
            else if(game.getKeyManager().right&&game.getKeyManager().down){
                x+=speed;
                y+=speed;
                head.tick();
                body.tick();
                arm.tick();
                leg.tick();
            }
            else{
                x+=speed;
                head.tick();
                body.tick();
                arm.tick();
                leg.tick();
            }
        }
        else if(game.getKeyManager().down){
            y+=speed;
            head.tick();
            body.tick();
            arm.tick();
            leg.tick();
        }
        else if(game.getKeyManager().up){
            y-=speed;
            head.tick();
            body.tick();
            arm.tick();
            leg.tick();
        }
    }
    @Override
    public void render(Graphics g){
        if(game.getKeyManager().down){
            g.drawImage(leg.getCurrentImage(), (int)x, (int)y, 120, 200, null);
            g.drawImage(body.getCurrentImage(), (int)x, (int)y, 120, 200, null);
            g.drawImage(arm.getCurrentImage(), (int)x, (int)y, 120, 200, null);
            g.drawImage(head.getCurrentImage(), (int)x, (int)y, 120, 200, null);
        }
        else{
            g.drawImage(leg.getCurrentImage(), (int)x, (int)y, 120, 200, null);
            g.drawImage(body.getCurrentImage(), (int)x, (int)y, 120, 200, null);
            g.drawImage(arm.getCurrentImage(), (int)x, (int)y, 120, 200, null);
            g.drawImage(head.getCurrentImage(), (int)x, (int)y, 120, 200, null);
        }
    }
}
