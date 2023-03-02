package practiceJavaProblem;
import java.util.Random;

public class diceRoller {
    
    public static void main (String[] args) {

        // calls on the java util for random number generator
        // diceResult.nextInt(x), where x is the range of 0 - x.
        Random randomSixDiceResult = new Random();
        int x = randomSixDiceResult.nextInt(6) + 1; //Because Java is Weird 

        System.out.println("You roll a: " + x); 

    }
}
