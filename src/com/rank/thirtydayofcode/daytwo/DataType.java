package com.rank.thirtydayofcode.daytwo;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args){
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scanner = new Scanner(System.in);
        System.out.println(i + scanner.nextInt());
        System.out.println(d + scanner.nextDouble());
        scanner.nextLine();
        System.out.println(s + scanner.nextLine());
        scanner.close();
    }
}
