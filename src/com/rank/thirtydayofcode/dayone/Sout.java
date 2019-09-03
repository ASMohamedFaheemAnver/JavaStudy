package com.rank.thirtydayofcode.dayone;

import java.util.Scanner;

public class Sout {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        scanner.close();
        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}