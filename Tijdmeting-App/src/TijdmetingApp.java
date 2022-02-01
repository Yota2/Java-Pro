
import java.util.*;
import java.text.*;

public class TijdmetingApp {
    public static void main(String[] args) {
        // getting input from the user
        double salary;
        double startHour;
        //int totalminutes;

        double salaryPerMinutes = (11.5*100)/60;
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

        double stophours;
        do {
            System.out.println("Fill the hours you stopped working  from [0-23]");
            stophours = userinp.nextInt();
        } while (stophours < 0 || stophours > 23);

        int stopminute;
        do {
            System.out.println("Fill the minute you stopped working  from [0-59]");
            stopminute = userinp.nextInt();
        } while (stopminute < 0 || stopminute > 59);

        double worktotalhour ,totalminutes, dayhour, nighthour, nightminutes,midinighthour, midinightminutes ,saturdaySalary,
                sundaySalary , fridaysalary ,bonsFriday,friDayhour;
        /*
        double totalminutes;
        double dayhour;
        double nighthour;
        double nightminutes;
        double midinighthour;
        double midinightminutes;
        */
        // calc night-hour

       /* if (startHour >= 18 ) {
            nighthour = 24 - startHour;
            worktotalhour = nighthour + stophours;
       } else if (startHour >= 7 ) {
            worktotalhour = (stophours - startHour);
        } else {
            worktotalhour = 0;
        }

        */

            if (startHour > stophours) {
                worktotalhour =  stophours - startHour + 24;
            } else if (startHour < stophours) {
                worktotalhour = (stophours - startHour);
            } else {
                worktotalhour = 0;
            }
            if (startminutes > stopminute) {
                totalminutes = stopminute - startminutes + 60;
                worktotalhour--;
            } else if (startminutes < stopminute) {
                totalminutes = (stopminute - startminutes );
            } else {
                totalminutes = 0;
            }


            double totaltimeWork = worktotalhour * 60 + totalminutes;

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
                    salary = (double) (salaryPerMinutes * totaltimeWork);
                    System.out.println("Start uur " + "     \t     " + "Stop uur " + "     \t     " + "Startday " + "     \t     " + "Enday" + "     \t          " + "uur gewerkt" + "     \t      " + "Loon");
                    System.out.print(startHour + "u" + startminutes + "m"+"     \t           " + stophours + "u" + startminutes + "m"+ "     \t       " + "Monday" + "      \t     " + "Monday" + "       \t        " + worktotalhour + "u"+ totalminutes + "m"+  "      \t	      " + salary/100 + "€");
                    break;
                case 2:
                    salary = (double) (salaryPerMinutes * totaltimeWork);
                    System.out.println("Start uur " + "     \t     " + "Stop uur " + "     \t     " + "Startday " + "     \t     " + "Enday" + "     \t          " + "uur gewerkt" + "     \t      " + "Loon");
                    System.out.print(startHour + "u" + startminutes + "m"+ "     \t           " + stophours + "u" + startminutes + "m"+ "     \t       " + "Tuesday" + "      \t     " + "Tuesday" + "       \t        " + worktotalhour + "u"+ totalminutes + "m"+  "      \t	      " + salary/100 + "€");
                    break;
                case 3:
                    salary = (double) (salaryPerMinutes * totaltimeWork);
                    System.out.println("Start uur " + "     \t     " + "Stop uur " + "     \t     " + "Startday " + "     \t     " + "Enday" + "     \t          " + "uur gewerkt" + "     \t      " + "Loon");
                    System.out.print(startHour + "u" + startminutes + "m"+ "     \t           " + stophours + "u" + startminutes + "m"+ "     \t       " + "Wednesday" + "      \t     " + "Wednesday" + "       \t        " + worktotalhour + "u"+ totalminutes + "m"+ "     \t	      " + salary/100 + "€");
                    break;
                case 4:
                    salary = (double) (salaryPerMinutes * totaltimeWork);
                    System.out.println("Start uur " + "     \t     " + "Stop uur " + "     \t     " + "Startday " + "     \t     " + "Enday" + "     \t          " + "uur gewerkt" + "     \t      " + "Loon");
                    System.out.print(startHour + "u" + startminutes + "m"+ "     \t           " + stophours + "u" + startminutes + "m"+ "     \t       " + "Thursday" + "      \t     " + "Thursday" + "       \t        " + worktotalhour + "u"+ totalminutes + "m"+ "     \t	      " + salary/100 + "€");
                    break;
                case 5:

                    if(stophours < 7 && stophours > 0.01 ){
                        bonsFriday = (stophours*11.25)*1.25;
                       // System.out.println(bonsFriday);
                        friDayhour =( 24.0 - startHour)*11.25;
                        totaltimeWork = friDayhour + bonsFriday;
                        fridaysalary =  friDayhour +  bonsFriday;
                       // System.out.println(fridaysalary);
                        System.out.println("Start uur " + "     \t     " + "Stop uur " + "     \t     " + "Startday " + "     \t     " + "Enday" + "     \t          " + "uur gewerkt" + "     \t      " + "Loon");
                        System.out.print(startHour + "u" + startminutes + "m" + "     \t           " + stophours + "u" + startminutes + "m" + "     \t       " + "Friday" + "      \t     " + "Friday" + "       \t        " + worktotalhour + "u" + totalminutes + "m" + "     \t	      " + fridaysalary  + "€");

                        } else {
                        fridaysalary = (double) (salaryPerMinutes * totaltimeWork);
                        System.out.println("Start uur " + "     \t     " + "Stop uur " + "     \t     " + "Startday " + "     \t     " + "Enday" + "     \t          " + "uur gewerkt" + "     \t      " + "Loon");
                        System.out.print(startHour + "u" + startminutes + "m" + "     \t           " + stophours + "u" + startminutes + "m" + "     \t       " + "Friday" + "      \t     " + "Friday" + "       \t        " + worktotalhour + "u" + totalminutes + "m" + "     \t	      " + fridaysalary /100 + "€");
                    }break;
                case 6:
                    saturdaySalary = (double) (salaryPerMinutes * totaltimeWork);
                    System.out.println("Start uur " + "     \t     " + "Stop uur " + "     \t     " + "Startday " + "     \t     " + "Enday" + "     \t          " + "uur gewerkt" + "     \t      " + "Loon");
                    System.out.print(startHour + "u" + startminutes + "m"+ "     \t           " + stophours + "u" + startminutes + "m"+ "     \t       " + "Saturday" + "      \t     " + "Saturday" + "       \t        " + worktotalhour + "u"+ totalminutes + "m"+ "     \t	      " + saturdaySalary/100+ "€");
                    break;
                    case 7:
                        sundaySalary = (double) (salaryPerMinutes * totaltimeWork);
                        System.out.println("Start uur " + "     \t     " + "Stop uur " + "     \t     " + "Startday " + "     \t     " + "Enday" + "     \t          " + "uur gewerkt" + "     \t      " + "Loon");
                        System.out.print(startHour + "u" + startminutes + "m"+ "     \t           " + stophours + "u" + startminutes + "m"+ "     \t       " + "Sunday" + "      \t     " + "Sunday" + "       \t        " + worktotalhour + "u"+ totalminutes + "m"+ "     \t	      " + sundaySalary/100+ "€");
                        break;
                default:
                    throw new IllegalStateException("Unexpected value: " + day);
            }
        }
    }

