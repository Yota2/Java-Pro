
import java.util.*;
import java.text.*;

public class TijdmetingApp {
    public static void main(String[] args) {
        // getting input from the user
        double salary;
        int startHour;
        //int totalminutes;
        Scanner userinp = new Scanner(System.in);
        do {
            System.out.println("Fill the hour you started working  from [0-23]");
            startHour = userinp.nextInt();
        }
        while (startHour < 0 || startHour > 23);
        int startminutes;
        do {
            System.out.println("Fill the minutes you started working  from [0-59]");
            startminutes = userinp.nextInt();
        } while (startminutes < 0 || startminutes > 59);

        int stophours;
        do {
            System.out.println("Fill the hours you stopped working  from [0-23]");
            stophours = userinp.nextInt();
        } while (stophours < 0 || stophours > 23);

        int stopminute;
        do {
            System.out.println("Fill the minute you stopped working  from [0-59]");
            stopminute = userinp.nextInt();
        } while (stopminute < 0 || stopminute > 59);

        double totalhour;
        double totalminutes;

        if (startHour > stophours) {
            totalhour = startHour - stophours;
        } else if (startHour < stophours) {
            totalhour = (stophours - startHour);
        } else {
            totalhour = 0;
        }

        if (startminutes > stopminute) {
            totalminutes = startminutes- startminutes;
        } else if (startminutes < stopminute) {
            totalminutes = (stopminute - startminutes);
        } else {
            totalminutes = 0;
        }


        double totaltimeWork =  totalhour + totalminutes  ;

        System.out.println("Please Fill in the number of the dy you started working");

        int day;
        System.out.println("Monday [1]");
        System.out.println("Tuesday [2]");
        System.out.println("Wednesday [3]");
        System.out.println("Thursday [4]");
        System.out.println("Friday [5]");
        System.out.println("Saturday [6]");
        System.out.println("Sunday [7]");


        // cal the money per day
        day = userinp.nextInt();

        switch (day) {
            case 1:
                //if (totaltimeWork > 0) {
                    salary = (int) (11.5 * totaltimeWork);
                    System.out.println("Start uur " + "     \t     " + "Stop uur " + "     \t     " + "Startday " +"     \t     "+ "Enday" + "     \t          "  + "uur gewerkt" + "     \t      " + "Loon");
                    System.out.print(startHour + "u" + startminutes + "     \t           " + stophours + "u" + startminutes +"     \t       "+ "Monday" + "      \t     "+"Monday"+ "       \t        "+ totalhour + "       \t	   " + salary + "€ ");
               // } else {
                   // System.out.println("wrong input");


                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + day);
        }
// Outputs "Thursday" (day 4)
    }



    }

