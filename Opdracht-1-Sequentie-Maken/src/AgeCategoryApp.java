
import java.util.*;
public class AgeCategoryApp {
    // A program that tells  whether  you are adult or child.
    //  Using if else statement

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in); // if i use var i don't have to  tell Scanner for java.
        System.out.println("-----*****Want to know your age category*****----- ");
        System.out.println("-----*****       Enter your age         *****-----");
         var age   = keyboard.nextInt();
         if(age >=18){
             System.out.println("You are Adult");
         } else
             System.out.println("You are child or adolescent");
    }
}
