package com.extra.sorting;

import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();
        scanner.skip("\n");
        String[] inputs = scanner.nextLine().split(" ");
        int[] sortedNumbers = new int[numberOfInput];
        for(int i = 0; i<numberOfInput; i++){
            sortedNumbers[i] = Integer.parseInt(inputs[i]);
        }
        int totalSwap = 0;
        for(int i = 0; i<sortedNumbers.length; i++){
            int swap = 0;
            for (int j = 0; j<sortedNumbers.length-1; j++){
                if(sortedNumbers[j]>sortedNumbers[j+1]){
                    int temp = sortedNumbers[j];
                    sortedNumbers[j] = sortedNumbers[j+1];
                    sortedNumbers[j+1] = temp;
                    swap++;
                    totalSwap++;
                }
            }
            if(swap==0){
                break;
            }
        }
        for(int number : sortedNumbers){
            System.out.print(number + " ");
        }
        System.out.println(totalSwap);
    }
}
