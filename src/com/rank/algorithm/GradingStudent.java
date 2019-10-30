package com.rank.algorithm;

import java.util.Scanner;

public class GradingStudent {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numberOfInput = scanner.nextInt();

        for (int i = 0; i<numberOfInput; i++){
            int studentMark = scanner.nextInt();

            if (studentMark<38){
                System.out.println(studentMark);
            }else{
                int addition = 5 - (studentMark%5);

                if (addition<3){
                    System.out.println(studentMark+addition);
                }else {
                    System.out.println(studentMark);
                }
            }
        }

    }
}
