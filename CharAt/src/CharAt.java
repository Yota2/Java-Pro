

    import java.util.*;
    public class CharAt {
        public static void main(String[] args) {
            // Printing  each char from a given string
            System.out.println("Enter Your Word  : ");
            Scanner keyboard = new Scanner(System.in);
            String name = keyboard.nextLine();
            for(int i = 0 ; i < name.length();i++){
                char x = name.charAt(i);
                System.out.println(x);
            }

        }
    }




