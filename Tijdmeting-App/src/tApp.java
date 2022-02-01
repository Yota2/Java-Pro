import java.util.*;
import java.text.*;

public class tApp {
    public static void main(String[] args) {
        // getting input from the user
        double salary;
        double startHour;
        double stophours;
        double totaltimeWork=0;
        double worktotalhour ,totalminutes, dayhour, nighthour, nightminutes,midinighthour, midinightminutes ,saturdaySalary,
                sundaySalary , fridaysalary ,bonsFriday,friDayhour,bonsSaturday;
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

        do {
            System.out.println("Fill the hours you stopped working  from [0-23]");
            stophours = userinp.nextInt();
        } while (stophours < 0 || stophours > 23);

        int stopminute;
        do {
            System.out.println("Fill the minute you stopped working  from [0-59]");
            stopminute = userinp.nextInt();
        } while (stopminute < 0 || stopminute > 59);
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
        // calculations
        double totaltimeWorkBasic, salaryBasic, totalTimeOvertime, salaryOvertime, totalSalary = 0;
        if(day >= 1 && day <=4 ) {
            totaltimeWork = worktotalhour * 60 + totalminutes;
            totalSalary = (double) (salaryPerMinutes * totaltimeWork);
        } else if(day == 5 ) {
            if(stophours < startHour ) {
                totaltimeWorkBasic = (24-startHour)*60 + startminutes;
                salaryBasic = (double) (salaryPerMinutes * totaltimeWorkBasic);
                totalTimeOvertime = stophours * 60 + stopminute;
                salaryOvertime = (double) ((salaryPerMinutes*1.25) * totalTimeOvertime);
                totalSalary = salaryBasic+salaryOvertime;
            }else {
                totaltimeWork = worktotalhour * 60 + totalminutes;
                totalSalary = (double) (salaryPerMinutes * totaltimeWork);
            }
        } else if(day == 6 ){
            if(stophours < startHour ) {
                totaltimeWorkBasic = (24-startHour)*60 + startminutes;
                salaryBasic = (double) ((salaryPerMinutes*1.25) * totaltimeWorkBasic);
                totalTimeOvertime = stophours * 60 + stopminute;
                salaryOvertime = (double) ((salaryPerMinutes*1.50) * totalTimeOvertime);
                totalSalary = salaryBasic+salaryOvertime;
            }else {
                totaltimeWork = worktotalhour * 60 + totalminutes;
                totalSalary = (double) ((salaryPerMinutes*1.25) * totaltimeWork);
            }
        } else {
            if(stophours < startHour ) {
                totaltimeWorkBasic = (24-startHour)*60 + startminutes;
                salaryBasic = (double) ((salaryPerMinutes*1.50) * totaltimeWorkBasic);
                totalTimeOvertime = stophours * 60 + stopminute;
                salaryOvertime = (double) ((salaryPerMinutes) * totalTimeOvertime);
                totalSalary = salaryBasic+salaryOvertime;
            }else {
                totaltimeWork = worktotalhour * 60 + totalminutes;
                totalSalary = (double) ((salaryPerMinutes*1.50) * totaltimeWork);
            }
        }

        System.out.println("Start uur " + "     \t     " + "Stop uur " + "     \t     " + "Startday " + "     \t     " + "Enday" + "     \t          " + "uur gewerkt" + "     \t      " + "Loon");
        System.out.print(startHour + "u" + startminutes + "m"+"     \t           " + stophours + "u" + startminutes + "m"+ "     \t       " + "Monday" + "      \t     " + "Monday" + "       \t        " + worktotalhour + "u"+ totalminutes + "m"+  "      \t          " + totalSalary/100 + "€");

    }
}


