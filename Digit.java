import java.awt.*;

public class Digit {
  int value;
  Box topBar, upperRightBar, lowerRightBar, bottomBar, lowerLeftBar, upperLeftBar, middleBar;

  public Digit(int value) {
      this.value = value;
  }
  
  public Digit(int value, Box topBar, Box middleBar, Box bottomBar, Box upperRightBar, Box lowerRightBar, Box upperLeftBar, Box lowerLeftBar) {
    this.value = value;
    this.topBar = topBar;
    this.middleBar = middleBar;
    this.bottomBar = bottomBar;
    this.upperRightBar = upperRightBar;
    this.lowerRightBar = lowerRightBar;
    this.upperLeftBar = upperLeftBar;
    this.lowerLeftBar = lowerLeftBar;

    updateDisplay();
  }

  
  public int getValue(){
      return value;
  }
  
  public void increment(){
    value++;
    if (value > 9){ value = 0; }
  }
  
  public void decrement(){
    value--;
    if (value < 0) { value = 9; }
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
    switch(whichBar){
      case "Top":return topBar;
      case "Middle": return middleBar;
      case "Bottom": return bottomBar;
      case "Upper Right": return upperRightBar;
      case "Lower Right": return lowerRightBar;
      case "Upper Left": return upperLeftBar;
      case "Lower Left": return lowerLeftBar;
      default: return topBar; 
    }  
  }
  
  public void paint(Graphics g){
    topBar.paint(g);
    upperRightBar.paint(g);
    lowerRightBar.paint(g);
    bottomBar.paint(g);
    lowerLeftBar.paint(g);
    upperLeftBar.paint(g);
    middleBar.paint(g);
  }
  
  public void updateDisplay(){
        switch (value){
          case 0:
            topBar.turnOn();
            upperRightBar.turnOn();
            lowerRightBar.turnOn();
            bottomBar.turnOn();
            lowerLeftBar.turnOn();
            upperLeftBar.turnOn();
            middleBar.turnOff();
            break;
          case 1:
            topBar.turnOff();
            upperRightBar.turnOn();
            lowerRightBar.turnOn();
            bottomBar.turnOff();
            lowerLeftBar.turnOff();
            upperLeftBar.turnOff();
            middleBar.turnOff();
            break;
          case 2: 
            topBar.turnOn();
            upperRightBar.turnOn();
            lowerRightBar.turnOff();
            bottomBar.turnOn();
            lowerLeftBar.turnOn();
            upperLeftBar.turnOff();
            middleBar.turnOn();
            break;
          case 3:
            topBar.turnOn();
            upperRightBar.turnOn();
            lowerRightBar.turnOn();
            bottomBar.turnOn();
            lowerLeftBar.turnOff();
            upperLeftBar.turnOff();
            middleBar.turnOn();
            break;
          case 4:
            topBar.turnOff();
            upperRightBar.turnOn();
            lowerRightBar.turnOn();
            bottomBar.turnOff();
            lowerLeftBar.turnOff();
            upperLeftBar.turnOn();
            middleBar.turnOn();
            break;
          case 5:
            topBar.turnOn();
            upperRightBar.turnOff();
            lowerRightBar.turnOn();
            bottomBar.turnOn();
            lowerLeftBar.turnOff();
            upperLeftBar.turnOn();
            middleBar.turnOn();
            break;
          case 6:
            topBar.turnOn();
            upperRightBar.turnOff();
            lowerRightBar.turnOn();
            bottomBar.turnOn();
            lowerLeftBar.turnOn();
            upperLeftBar.turnOn();
            middleBar.turnOn();
            break;
          case 7:
            topBar.turnOn();
            upperRightBar.turnOn();
            lowerRightBar.turnOn();
            bottomBar.turnOff();
            lowerLeftBar.turnOff();
            upperLeftBar.turnOff();
            middleBar.turnOff();
            break;
          case 8:
            topBar.turnOn();
            upperRightBar.turnOn();
            lowerRightBar.turnOn();
            bottomBar.turnOn();
            lowerLeftBar.turnOn();
            upperLeftBar.turnOn();
            middleBar.turnOn();
            break;
          case 9:
            topBar.turnOn();
            upperRightBar.turnOn();
            lowerRightBar.turnOn();
            bottomBar.turnOff();
            lowerLeftBar.turnOff();
            upperLeftBar.turnOn();
            middleBar.turnOn();
            break;
        }
        
  }   
       
        
}
