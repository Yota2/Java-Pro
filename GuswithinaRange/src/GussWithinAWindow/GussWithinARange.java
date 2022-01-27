package GussWithinAWindow;
import java.util.*;
public class GussWithinARange {
    public static void main(String[] args)
    {
        int answer, guess;
        // maximum value is 10
        var MAX = 10;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean correct = false;
        answer = rand.nextInt(MAX) + 1;
        // loop until the guess is correct
        while (!correct) {
            System.out.println("Guess a number between 1 and 10: ");
            // guess value
            guess = in.nextInt();
            // if guess is greater than actual
            if (guess > answer) {
                System.out.println("Go lower  , try again");
            }
            else if (guess < answer) {
                System.out.println("Go higher , try again");
            }
            else {

                System.out.println(" Congratulation 😄😄😄!!! you guessed the.It was:  " + guess);
                correct = true;
            }
        }
        System.exit(0);
    }
}







