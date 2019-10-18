package com.rank.thirtydayofcode.daytwentysix;

import java.util.Scanner;

public class NestedLogic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int actualDay = scanner.nextInt();
        int actualMonth = scanner.nextInt();
        int actualYear = scanner.nextInt();

        int expectedDay = scanner.nextInt();
        int expectedMonth = scanner.nextInt();
        int expectedYear = scanner.nextInt();
        scanner.close();

        int dayLate = actualDay - expectedDay;
        int monthLate = actualMonth - expectedMonth;
        int yearLate = actualYear - expectedYear;

        if (yearLate>0){
            System.out.println(10000);
        }else if (yearLate<0){
            System.out.println(0);
        }else if (yearLate==0){
            if (monthLate>0){
                System.out.println(monthLate*500);
            }else if (monthLate<0){
                System.out.println(0);
            }else if (monthLate==0){
                if (dayLate>0){
                    System.out.println(dayLate*15);
                }else{
                    System.out.println(0);
                }
            }
        }
    }
}
