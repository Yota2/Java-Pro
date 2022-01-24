package Salary;
import java.util.*;
public class calcNetSalry {
    public static void main(String[] args) {

        Scanner Keyboard  = new Scanner(System.in);  // Create a Scanner object to input Salary
        System.out.println("Enter username  : ");
        String userName = Keyboard.nextLine();
        System.out.println("Where do you live : ");
        String place = Keyboard.nextLine();
        System.out.println("Enter Your Salary");
        int  Salary = Keyboard.nextInt();
          // How can i format  float values.

        //Calc Net Sal
        int Tax =21;
        int TaxedAmount = (Salary * Tax) /100;
        int  netSalary  =  Salary - TaxedAmount;
        System.out.printf("Hallo : %s you live in %s  your netIncome is %d%n euros" , userName,place, netSalary);

    }
}

