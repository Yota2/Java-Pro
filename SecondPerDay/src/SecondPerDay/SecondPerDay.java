package SecondPerDay;
import java.util.Scanner; //importing Java  in scanners class;


public class SecondPerDay {
    public static void main(String[] args) {
        Scanner InpDayObj = new Scanner(System.in); //  creates  scanner
        System.out.print("Enter the Day  :  ");

   String Inpday = InpDayObj.nextLine(); // Reading user Day input
        System.out.println("Input Day is   :  " + Inpday);//Printing the input day
    }
}
