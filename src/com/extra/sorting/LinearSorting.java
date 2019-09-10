package com.extra.sorting;

import java.util.Scanner;

public class LinearSorting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        int index = 0;
        for(String in : input){
            numbers[index++] = Integer.parseInt(in);
        }
        for(int i = 0; i<input.length; i++){
            for(int j = i; j<input.length; j++){
                if(numbers[i]>numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for(int number : numbers){
            System.out.print(number + " ");
        }
    }
}
