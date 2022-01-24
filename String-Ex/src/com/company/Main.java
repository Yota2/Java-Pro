package com.company;

import javax.sound.midi.Soundbank;

// String Method Examples
public class Main {

            public static void main(String[] args) {

                String a = "Hallow World Substring";
                // To Print out  "or" you can do
                System.out.println(a.substring(8,10));
                // To Print out  "Sub" you can do
                System.out.println(a.substring(13 , 16));
                String name = " Marla Singer";
                int x = 3;
                int y = 5;
                //Printing number value from the int
                String point = "(" + x + ", " + y + ")";
                System.out.println (point);
                // String length
                String starz = "Yeezy & Hova";
                System.out.println(starz.length()); // 12
                System.out.println(starz.indexOf("H"));
                System.out.println(starz.toLowerCase());

            }
        }
