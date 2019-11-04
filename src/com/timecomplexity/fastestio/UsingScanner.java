package com.timecomplexity.fastestio;

import java.util.Scanner;

 // 7 3 1 51 966369 7 9 999996 11 // Use this input

public class UsingScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();
        int divider = scanner.nextInt();

        int count = 0;

        while (numberOfInput-->0){
            int number = scanner.nextInt();
            if (number%divider==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
