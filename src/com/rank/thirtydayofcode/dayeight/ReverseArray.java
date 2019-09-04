package com.rank.thirtydayofcode.dayeight;

import java.util.Scanner;

public class ReverseArray {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int numberOfInput = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[numberOfInput];
        String[] arrItem = scanner.nextLine().split(" ");
        int index = numberOfInput-1;
        for(String arrString : arrItem){
            arr[index--] = Integer.parseInt(arrString);
        }
        for(int rNumber : arr){
            System.out.print(rNumber + " ");
        }
    }
}
