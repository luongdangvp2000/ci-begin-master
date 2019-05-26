package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by huynq on 7/4/17.
 */

public class Program {
    public static void main(String[] args) {
        JFrame window = new JFrame();  //khoi tao man hinh game
        window.setTitle("Game Touhou");  //tieu de
//        window.setSize(800, 600); // px
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.addKeyListener(new KeyAdapter() {
                @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_W) {
                    KeyEventPress.isUpPress = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_A) {
                    KeyEventPress.isLeftPress = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_S) {
                    KeyEventPress.isDownPress = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_D) {
                    KeyEventPress.isRightPress = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_W) {
                    KeyEventPress.isUpPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_A) {
                    KeyEventPress.isLeftPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_S) {
                    KeyEventPress.isDownPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_D) {
                    KeyEventPress.isRightPress = false;
                }
            }
        });

        GamePanel panel = new GamePanel();
        panel.setBackground(Color.CYAN);
        window.add(panel);
        panel.setPreferredSize(new Dimension(800, 600));
        window.pack();

        window.setVisible(true);

        panel.gameLoop(); // start game

        // ctrl + ? // comment / uncomment code
        // alt + enter // fix code
        // (fn +) shift + f6 // rename
        // ctrl + alt + l // format code
    }
}
