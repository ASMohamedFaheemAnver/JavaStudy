package com.rank.thirtydayofcode.daysix;

import java.util.Scanner;

public class Loop {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int n = scanner.nextInt();
        for(int i = 0; i<10; i++){
            System.out.println(n + " x " + (i+1) + " = " + n*(i+1));
        }
        scanner.close();
    }
}
