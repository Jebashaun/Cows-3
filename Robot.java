import java.awt.*;

public class Robot
{
    private Box leftLeg, rightLeg, body, leftArm, rightArm, head, rightEye, leftEye, mouth;

    boolean armsUp;
    

    public Robot(Box leftLeg, Box rightLeg, Box body, Box leftArm, Box rightArm, Box head, Box rightEye, Box leftEye, Box mouth){
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.body = body;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
        this.head = head;
        this.rightEye = rightEye;
        this.leftEye = leftEye;
        this.mouth = mouth;
    }
    
    public Box getBox(String whichPart){
        switch(whichPart){
            case "Left Leg":
                return this.leftLeg;
            case "Right Leg":
                return this.rightLeg;
            case "Body":
                return this.body;
            case "Left Arm":
                return this.leftArm;
            case "Right Arm":
                return this.rightArm;
            case "Head":
                return this.head;
            case "Right Eye":
                return this.rightEye;
            case "Left Eye":
                return this.leftEye;
            case "Mouth":
                return this.mouth;
            default:
                return null;
        }
            
    }
    
    public void moveRight(int amount){
        leftLeg.moveRight(amount);
        rightLeg.moveRight(amount);
        body.moveRight(amount);
        leftArm.moveRight(amount);
        rightArm.moveRight(amount);
        head.moveRight(amount);
        rightEye.moveRight(amount);
        leftEye.moveRight(amount);
        mouth.moveRight(amount);
    }
    
    public void moveLeft(int amount){
        leftLeg.moveLeft(amount);
        rightLeg.moveLeft(amount);
        body.moveLeft(amount);
        leftArm.moveLeft(amount);
        rightArm.moveLeft(amount);
        head.moveLeft(amount);
        rightEye.moveLeft(amount);
        leftEye.moveLeft(amount);
        mouth.moveLeft(amount);
    }
    
    public void moveUp(int amount){
        leftLeg.moveUp(amount);
        rightLeg.moveUp(amount);
        body.moveUp(amount);
        leftArm.moveUp(amount);
        rightArm.moveUp(amount);
        head.moveUp(amount);
        rightEye.moveUp(amount);
        leftEye.moveUp(amount);
        mouth.moveUp(amount);
    }
    
    public void moveDown(int amount){
        leftLeg.moveDown(amount);
        rightLeg.moveDown(amount);
        body.moveDown(amount);
        leftArm.moveDown(amount);
        rightArm.moveDown(amount);
        head.moveDown(amount);
        rightEye.moveDown(amount);
        leftEye.moveDown(amount);
        mouth.moveDown(amount);      
    }
    
    public void closeLeftEye(){
        leftEye.stretchUp(-leftEye.getHeight());
    }
    
    public void closeRightEye(){
        rightEye.stretchUp(-rightEye.getHeight());
    }
    
    public void openLeftEye(int amount){
        leftEye.stretchUp(amount * 2);
    }

    public void openRightEye(int amount){
        rightEye.stretchUp(amount * 2);
    }
    
    public void growLegs(int amount){
        leftLeg.stretchUp(amount);
        rightLeg.stretchUp(amount);
        body.moveUp(amount);
        leftArm.moveUp(amount);
        rightArm.moveUp(amount);
        head.moveUp(amount);
        rightEye.moveUp(amount);
        leftEye.moveUp(amount);
        mouth.moveUp(amount); 
    }
    
    public void swivelArms(){
        if (armsUp) {
          leftArm.stretchDown(leftArm.getHeight());
          leftArm.stretchUp(leftArm.getHeight() / 2);
          rightArm.stretchDown(rightArm.getHeight());
          rightArm.stretchUp(rightArm.getHeight() / 2);
            armsUp = false;
        } else { // swivel
          leftArm.stretchUp(leftArm.getHeight());
          leftArm.stretchDown(leftArm.getHeight() / 2);
          rightArm.stretchUp(rightArm.getHeight());
          rightArm.stretchDown(rightArm.getHeight() / 2);
          System.out.println("down");

            armsUp = true;
        }
    }
    
    public void paint(Graphics g){
        leftLeg.paint(g);
        rightLeg.paint(g);
        body.paint(g);
        leftArm.paint(g);
        rightArm.paint(g);
        head.paint(g);
        rightEye.paint(g);
        leftEye.paint(g);
        mouth.paint(g);
    }
}
