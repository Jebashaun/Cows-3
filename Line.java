import java.awt.*;
public class Line {
    Point endpoint1 , endpoint2;

  
    public Line(Point endpoint1, Point endpoint2){
      this.endpoint1 = endpoint1;
      this.endpoint2 = endpoint2;
    }
    
    public Point getEndpoint1(){
        return endpoint1;
    }
    
    public Point getEndpoint2(){
        return endpoint2;
    }
    
    public double getDistance(){
        return Math.sqrt(Math.pow(endpoint2.getY() - endpoint1.getY(), 2) + Math.pow(endpoint2.getX() - endpoint1.getX(), 2));
    }
    
    public Point getMidPoint(){
        return new Point(-10, -10, Color.BLUE, -99);
    }
    
    public void moveRight(int amount){
        
    }
    
    public void moveLeft(int amount){
        
    }
    
    public void moveUp(int amount){
        
    }
    
    public void moveDown(int amount){
        
    }
    
    public boolean equals(Line otherLine){
      return true;
        
    }
    
    public int compareTo(Line otherLine){
            return 0;
        
    }
    
    public void paint(Graphics g){
        
    }
}
