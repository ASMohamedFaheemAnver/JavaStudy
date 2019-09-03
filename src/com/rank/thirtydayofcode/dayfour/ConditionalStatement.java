package com.rank.thirtydayofcode.dayfour;

import java.util.Scanner;

public class ConditionalStatement {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int number = scanner.nextInt();
        scanner.close();
        int remain = number%2;
        if(remain!=0){
            System.out.println("Weird");
        }else {
            if(number>=2 && number<=5){
                System.out.println("Not Weird");
            }else if(number>=6 && number<=20){
                System.out.println("Weird");
            }else if(number>20){
                System.out.println("Not Weird");
            }
        }
    }
}
