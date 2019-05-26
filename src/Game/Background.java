package Game;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background {
    BufferedImage image;
    Vector2D background;
    public Background(){
        image= SpriteUtils.loadImage("assets/images/background/0.png");
        background=new Vector2D(0,600-3109);
    }

    public void render(Graphics g){
        g.drawImage(image,(int)background.x,(int)background.y,null);

    }

    public void run(){
        background.y+=10;
        if(background.y>=0){
            background.y=0;
        }
    }
}
