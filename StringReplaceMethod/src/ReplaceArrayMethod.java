import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReplaceArrayMethod {
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the Name you want ");
        String name = myObj.nextLine();

        String[] UserName =  new String[] {"Yohana" , "Jeremy", "Kumari" , "Atilla"};
        List<String> list = Arrays.asList(UserName);
        if(list.contains("Yohana")) System.out.println("Find Yohana");
    }


    public static String UserInput() {
        List<String> list = Arrays.asList();
        if(list.contains("Yohana"))
            System.out.println("Find Yohana");

        return(UserInput()) ;
    }}


