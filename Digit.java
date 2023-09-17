import java.awt.*;

public class Digit {
  int value;
    
  public Digit(int value) {
      this.value = value;
  }
  
  public Digit(int value, Box topBar, Box middleBar, Box bottomBar, Box upperRightBar, Box lowerRightBar, Box upperLeftBar, Box lowerLeftBar) {
      
  }

  public int getValue(){
      return value;
  }
  
  public void increment(){
    value++;
  }
  
  public void decrement(){
    value--;
  }
  
  public void setValue(int nextValue){
    value = nextValue;
  }
  
  public boolean equals(Digit otherDigit){
      return value == otherDigit.getValue();
  }
  
  public int compareTo(Digit otherDigit){
    if (equals(otherDigit)){ return 0; }
    if (value > otherDigit.getValue()) { return 1; }
    else return -1;
  }
  
  public Box getBar(String whichBar){
      return new Box(-10, -10, Color.BLUE, -323, -23948);
  }
  
  public void paint(Graphics g){

  }
  
  public void updateDisplay(){
      
  }
        
}
