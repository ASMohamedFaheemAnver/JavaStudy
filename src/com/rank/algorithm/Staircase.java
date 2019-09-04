package com.rank.algorithm;

import java.util.Scanner;

public class Staircase {
    static void staircase(int n){
        for (int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(j+1>=n-i){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int n = scanner.nextInt();
        staircase(n);
        scanner.close();
    }
}
