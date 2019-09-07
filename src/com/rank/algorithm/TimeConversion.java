package com.rank.algorithm;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String localTime){
        Format format = new DecimalFormat("00");
        int time = Integer.parseInt(localTime.substring(0,2));
        if(localTime.endsWith("AM")){
            if(time==12){
                time = 00;
            }
        }else if (localTime.endsWith("PM")){
            if(time!=12){
                time += 12;
            }
        }

        return (format.format(time) + localTime.substring(2,localTime.length()-2));
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        String localTime = scanner.nextLine();
        String standartTime = timeConversion(localTime);
        System.out.println(standartTime);
    }
}
