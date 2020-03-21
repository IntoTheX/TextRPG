
package dev.rjp.rpg.input;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseManager implements MouseListener, MouseMotionListener
{
    private boolean left, right;
    
    int mx;
    int my;
    
    public MouseManager(){
        
    }
    
    public boolean isLeftPressed(){
        return left;
    }
    
    public boolean isRightPressed(){
        return right;
    }
    
    public int getMx(){
        return mx;
    }
    public int getMy(){
        return my;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
 
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        if(e.getButton() == MouseEvent.BUTTON1){
            left = true;
        }
        else if(e.getButton() == MouseEvent.BUTTON3){
            right = true;
        }
 }

    @Override
    public void mouseReleased(MouseEvent e) {
         
        if(e.getButton() == MouseEvent.BUTTON1){
            left = false;
        }
        else if(e.getButton() == MouseEvent.BUTTON3){
            right = false;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
 
    }

    @Override
    public void mouseDragged(MouseEvent e) {
 
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mx = e.getX();
        my = e.getY();
    }
    
}
