import java.util.Scanner;

public class StringCompar {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("What is your name  :");
        String name = Keyboard.next();

        if(name.equals("Yohana") ){
            System.out.println("super");
        }

        // Comparing char values
        Scanner console = new Scanner(System.in);
        String word = console.next();
        if (word.charAt(word.length() - 1) == 's') {
            System.out.println(word + " is plural.");
        }
        // All english letters in java is conciders as ACCII values or numbers
        // Printing from A to Z
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
        }

    }
}
