import javax.sound.midi.Soundbank;
import java.util.*;
// This is  a program to Suggest a baby name based on their parents name

    public class babySuggestionName {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give Parent 1 name suggestion & Give Parent 2  & Guss the Gender by Write F or M:   ");
        // assigning the three variables
        String parent_1_firstName = keyboard.nextLine();
        String parent_2_firstName = keyboard.nextLine();
        String gender = keyboard.nextLine();
        System.out.println(parent_1_firstName + " " + parent_2_firstName + " " + gender);
        String boyBaby = parent_1_firstName.substring(0, 4) + parent_2_firstName.substring(0, 2);
        String girlBaby = parent_2_firstName.substring(0, 2) + parent_1_firstName.substring(0, 4);
        // If statement working by gender and generates the name
        if (gender.equals("M")) {
            System.out.println("Your babyBoy suggestion name is : " + boyBaby.toUpperCase());
        }
        else {
            System.out.println("Your babyGirl suggestion name is : " + girlBaby.toUpperCase());
        }
    }}



