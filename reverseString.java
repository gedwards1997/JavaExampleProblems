package practiceJavaProblem;
public class reverseString { 

    //Main Method
    public static void main (String[] args) {

        String r = reverse("dog");
        System.out.println(r);

    }

    //method
    public static String reverse(String s) {
        // store word into array
        char[] letters = new char[s.length()];

        int letterIndex = 0;

        // for i is 0 and i is less than length of string, loop then add I + 1
        // i will equal the total length to string - 1 to start at the last number
        // since array strats at 0.
        // then run until I is greater or equal to length of string
        // i-- to go backwards 

        for(int i = s.length() - 1; i >= 0; i--) {
            letters[letterIndex] = s.charAt(i); 
            letterIndex++;
        }

        // prints out the reverse String length so from last letter to first 
        String reverse = ""; 
        for ( int i = 0; i < s.length(); i++) {
            reverse = reverse + letters[i];
        }

        return reverse; 


    }
}
