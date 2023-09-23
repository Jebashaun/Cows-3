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
        int xValue = (endpoint1.getX() + endpoint2.getX()) / 2;
        int yValue = (endpoint1.getY() + endpoint2.getY()) / 2;
        return new Point(xValue, yValue, endpoint1.getColor(), endpoint1.getRadius());
    }
    
    public void moveRight(int amount){
        endpoint1.moveRight(amount);
        endpoint2.moveRight(amount);
    }
    
    public void moveLeft(int amount){
        endpoint1.moveLeft(amount);
        endpoint2.moveLeft(amount);
    }
    
    public void moveUp(int amount){
        endpoint1.moveUp(amount);
        endpoint2.moveUp(amount);
    }
    
    public void moveDown(int amount){
        endpoint1.moveDown(amount);
        endpoint2.moveDown(amount);
    }
    
    public boolean equals(Line otherLine){
        return (endpoint1.equals(otherLine.endpoint1) && endpoint2.equals(otherLine.endpoint2)) || (endpoint2.equals(otherLine.endpoint1) && endpoint1.equals(otherLine.endpoint2));
    }
    
    public int compareTo(Line otherLine){
        if (getDistance() == otherLine.getDistance()){ return 0; }
        if (getDistance() > otherLine.getDistance()){
            return 1;
        } else {
            return -1;
        }
        
    }
    
    public void paint(Graphics g){
        
    }
}
