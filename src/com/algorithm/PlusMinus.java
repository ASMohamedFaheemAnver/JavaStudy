package com.algorithm;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int plus = 0;
        int minus = 0;
        int zero = 0;

        for (int number : arr){
            if (number > 0){
                plus++;
            }else if(number < 0){
                minus++;
            }else {
                zero++;
            }
        }
        double dplus = (double)plus/arr.length;
        double dminus = (double)minus/arr.length;
        double dzero = (double)zero/arr.length;
        Format format = new DecimalFormat("0.000000");
        System.out.println(format.format(dplus));
        System.out.println(format.format(dminus));
        System.out.println(format.format(dzero));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
