package Game;

import tklibs.Mathx;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Vector;

public class Player {
    BufferedImage image;
    Vector2D position;

    public Player(){
        image= SpriteUtils.loadImage("assets/images/players/straight/0.png");
        position=new Vector2D(300,300);
    }

    public void render(Graphics g){
        g.drawImage(image, (int)position.x, (int)position.y, null);
    }

    public void run(){
        if(KeyEventPress.isUpPress){
            position.y-=2;
        }
        if(KeyEventPress.isDownPress){
            position.y+=2;
        }
        if(KeyEventPress.isRightPress){
            position.x+=2;
        }
        if(KeyEventPress.isLeftPress){
            position.x-=2;
        }

        position.x= Mathx.clamp(position.x,0,352);
        position.y=Mathx.clamp(position.y,0,552);
    }

}
