import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Point{
  private int x, y = 0;
  private Color theColor;
  private int radius = 0;
  
  
  //create costructor
  public Point(int x, int y, Color theColor, int size){
    this.x = x;
    this.y = y;
    this.theColor = theColor;
    radius = size;
  }
  
  public int getX(){
      return x;
  }
  
  public int getY(){
      return y;
  }
  
  public Color getColor(){
      return theColor;
  }
  
  public int getRadius(){
      return radius;
  }
  
  public void moveRight(int amount){
    x += amount;
  }
  
  public void moveLeft(int amount){
    x -= amount;
  }
  
  public void moveUp(int amount){
    y += amount;
  }
  
  public void moveDown(int amount){
    y -= amount;
  }
  
  public void setX(int x){

  }
  
  public void setY(int y){

  }
  
  public void moveTo(int x, int y){
    this.x = x;
    this.y = y;
  }
  
  public boolean equals(Point otherPoint){
    return x == otherPoint.getX() && y == otherPoint.getY();
  }
  
  public int compareTo(Point otherPoint){
    double distance1 = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
    double distance2 = Math.sqrt(Math.pow(otherPoint.getX(),2) + Math.pow(otherPoint.getY(), 2));

    if (distance1 == distance2) { return 0; }
    else if (distance1 > distance2) { return 1; }
    else { return -1; }

  }

  public void paint(Graphics g){ 
    g.setColor(theColor);
    g.drawOval(x - radius, y - radius, radius*2, radius*2);
      
  }
  
}