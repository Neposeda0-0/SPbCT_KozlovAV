package com.company;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class NewApplet extends Applet implements MouseListener{
    private boolean click = false;
    private int x=0, y=30, width=20, height=20;
    Rectangle rect = new Rectangle(x,y,width,height);

    public void init(){
        addMouseListener(this);
    }
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D)g;
        gr.fill(rect);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (!click) {
            click = true;
        } else {
            click = false;
            setBackground(RandomColor());
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                if(click){
                    while (rect.x<382){
                        if(!click){
                            break;
                        }
                        rect.setLocation(rect.x+1, rect.y);
                        repaint();
                        try {
                            Thread.sleep(12);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                    }
                }

                if(!click){
                    while (rect.x>0){
                        if(click){
                            break;
                        }
                        rect.setLocation(rect.x-1, rect.y);
                        repaint();
                        try {
                            Thread.sleep(12);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public Color RandomColor(){
        Color c = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
        return c;
    }
}
