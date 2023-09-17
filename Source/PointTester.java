import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class PointTester extends JPanel implements KeyListener {

    Point first, second;

    public PointTester() {

        first = new Point(100, 200, Color.BLUE, 10);
        second = new Point(50 + (int)(Math.random()*600), 50 + (int)(Math.random()*600), new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)), 10);

    }

    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
        char c = e.getKeyChar();

        //finish the if statement so that the WASD keys 
        if(c == 'd'){
            first.moveRight(5);
            second.moveRight(5);
        }else if(c == 'a'){
            first.moveLeft(5);
            second.moveLeft(5);
        }else if(c == 's'){
            first.moveDown(5);
            second.moveDown(5);
        }else if(c == 'w'){
            first.moveUp(5);
            second.moveUp(5);
        }
        if(c == 'l'){
            first.moveRight(50);
            second.moveRight(50);
        }else if(c == 'j'){
            first.moveLeft(50);
            second.moveLeft(50);
        }else if(c == 'k'){
            first.moveDown(50);
            second.moveDown(50);
        }else if(c == 'i'){
            first.moveUp(50);
            second.moveUp(50);
        }

        repaint();
    }

    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.PINK);
        for(int x = 50; x <= 2000; x += 50){
            g.drawLine(x, 0, x, 2000);
        }
        for(int y = 50; y <= 2000; y += 50){
            g.drawLine(0, y, 2000, y);
        }
        g.setColor(Color.BLACK);
        g.drawString("A - Move Left(5), S - Move Down(5), D - Move Right(5), W - Move Up(5)", 0, 20);
        g.drawString("J - Move Left(50), K - Move Down(50), L - Move Right(50), I - Move Up(50)", 0, 40);

        first.paint(g);
        second.paint(g);

    }

    public void keyTyped(KeyEvent e) {

        char c = e.getKeyChar();  

    }

    public void keyPressed(KeyEvent e) {
        char c = e.getKeyChar();
    }

    public static void main(String [] arg){
        PointTester game = new PointTester();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(800, 800);
        frame.addKeyListener(game);
        frame.getContentPane().add(game);
        frame.setLocation(0, 0);
        frame.setVisible(true);
    }
}