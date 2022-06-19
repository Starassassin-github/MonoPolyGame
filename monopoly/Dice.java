import java.util.*;

public class Dice {
    
    private int faceValue;

    public Dice(){

    }

    public void randomNumber(){
        Random rand = new Random();
        this.faceValue = rand.nextInt(6) + 1; 
    }

    public int getFaceValue(){
        return faceValue;
    }
}
