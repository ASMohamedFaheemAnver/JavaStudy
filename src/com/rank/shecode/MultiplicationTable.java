package com.rank.shecode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        DecimalFormat decimalFormat = new DecimalFormat("00");
        for (int i = 0; i<12; i++){

            System.out.println(number + " x " + decimalFormat.format((i+1)) + " = " + (number*(i+1)));
        }
    }
}
