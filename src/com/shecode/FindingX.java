package com.shecode;

import java.util.Scanner;

public class FindingX {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int matrix = scanner.nextInt();
        scanner.skip("\n");
        for (int i = 0; i<matrix; i++){
            String string = scanner.nextLine();
            if (string.contains("X")){
                System.out.println(i + "," + string.indexOf("X"));
                break;
            }
        }
    }
}
