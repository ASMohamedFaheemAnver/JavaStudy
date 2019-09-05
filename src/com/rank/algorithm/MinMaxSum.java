package com.rank.algorithm;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class MinMaxSum {

    static void miniMaxSum(int[] arr){
        Format formate = new DecimalFormat("##########");
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            long sum = 0;
            for (int j = i; j<i+4; j++){
                int index = j%5;
                sum += arr[index];
            }
            if(max<sum){
                max = sum;
            }
            if(min>sum){
                min = sum;
            }
        }
        System.out.print(formate.format(min) + " " + formate.format(max));
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] arr = new int[5];
        String[] arrItem = scanner.nextLine().split(" ");
        scanner.close();

        for(int i = 0; i<5; i++){
            arr[i] = Integer.parseInt(arrItem[i]);
        }
        miniMaxSum(arr);
    }
}
