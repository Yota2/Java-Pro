//This program does work it was from the pdf book
/*
import java.util.*;
 public class BabyNamer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Parent 1 first name? ");
        String name1 = s.next();
        System.out.print("Parent 2 first name? ");
        String name2 = s.next();
        System.out.print("Child Gender? ");
        String gender = s.next();
        String halfName1 = getHalfName(name1);
        String halfName2 = getHalfName(name2);
        String name = "";
        if(gender.toLowerCase().startsWith("m")){
            name = halfName1 + halfName2;
        } else {
        }  name = halfName2 + halfName1;
    }  System.out.println("Suggested name: " + name.toUpperCase());
}
    public static String getHalfName(String name) {
        int halfIndex = name.length() / 2;
        String half = name.substring(0, halfIndex);
        return half;
    } }
*/