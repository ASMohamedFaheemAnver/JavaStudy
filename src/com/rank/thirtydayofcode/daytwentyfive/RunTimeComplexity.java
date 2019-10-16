package com.rank.thirtydayofcode.daytwentyfive;

import java.util.Scanner;

public class RunTimeComplexity {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numberOfInput = scanner.nextInt();

        int[] input = new int[numberOfInput];

        for (int i = 0; i<numberOfInput; i++){
            input[i] = scanner.nextInt();
        }

        for (int i = 0; i<numberOfInput; i++){
            boolean isPrime = true;

            if (input[i]==1){
                isPrime = false;
            }
            if (input[i]==2){
                isPrime = true;
            }

            for (int j = 2; j*j<=input[i]; j+=1){
                if (input[i]%j==0){
                    isPrime = false;
                }
            }

            if (isPrime){
                System.out.println("Prime");
            }else {
                System.out.println("Not prime");
            }
        }
    }
}
