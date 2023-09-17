import java.awt.*;

public class Box {
  private int x, y;
  private Color theColor;
  private int width, height;

  public Box(int x, int y, Color theColor, int width, int height){
    this.x = x;
    this.y = y;
    this.theColor = theColor;
    this.width = width;
    this.height = height;
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

  public int getWidth(){
      return width;
  }

  public int getHeight(){
      return height;
  }

  public void moveRight(int amount){
    x += amount;
  }

  public void moveLeft(int amount){
    x -= amount;
  }

  public void moveUp(int amount){
    y -= amount;
  }

  public void moveDown(int amount){
    y += amount;
  }

  public void setX(int x){
    this.x = x;
  }

  public void setY(int y){
    this.y = y;
  }

  public void moveTo(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void stretchRight(int amount){
    width += amount;
  }
  
  public void stretchLeft(int amount){
    width -= amount;
  }

  public void stretchDown(int amount){
    height += amount;
  }
  
  public void stretchUp(int amount){
    height -= amount;
  }
  
  public void stretch(int amount){
    
  }

  public boolean equals(Box otherBox){
    return width == otherBox.getWidth() && height == otherBox.getHeight();
      
  }

  public int compareTo(Box otherBox){
    if (equals(otherBox)) { return 0; }
    if (width * height > otherBox.getHeight() * otherBox.getWidth()){
      return 1;
    } else {
      return -1;
    }
      
  }

  public void turnOn(){

  }

  public void turnOff(){

  }

  public boolean getIsOn(){
    return true;
  }

  public void paint(Graphics g){
    g.setColor(theColor);
    g.fillRect(x, y, width, height);
  }
}
