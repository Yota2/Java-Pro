package Looto;
import java.util.*;
public class LootoGeneratWhile {
    public static void main(String[] args) {
        System.out.println("--Generate  6 Digit numbers for loto winnners");
        int count = 0;
        int randNumber = 0;
        while(count != 6){
            randNumber = (int)(Math.random()*6 + 1);//added
            System.out.println("The number generated is " + randNumber);
            count = count + 1;
        }

    }



    }



