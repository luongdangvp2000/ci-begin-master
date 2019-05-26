package Game;

import tklibs.Mathx;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Enemy {
    BufferedImage image;
    Vector2D enemy;
    public Enemy(){
        image= SpriteUtils.loadImage("assets/images/enemies/level0/pink/0.png");
        enemy=new Vector2D(Mathx.random(0,360),-50);
    }

    public void render(Graphics g){
        g.drawImage(image,(int)enemy.x,(int)enemy.y,null);
    }
    public void run(){
        enemy.y += 3;
        if(enemy.y > 600) {
            enemy.y = -50;
            enemy.x = Mathx.random(0, 360);
        }
    }
}
