package practiceJavaProblem;

import java.util.Scanner;

public class patternWithForLoops {

    public static void main (String[] args) {

        System.out.println("How many stars would you like? ");
        Scanner scan = new Scanner(System.in);
        int numOfStar = scan.nextInt();

        // i is the row and j is the column
        for(int i = 1; i <= numOfStar; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }

        for (int i = numOfStar - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }

    }
}