package com.rank.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BirthdayCakeCandle {
    static int birthdayCakeCandles(int[] ar){
        Map<Integer, Integer> map = new HashMap<>();
        int maxHeight = ar[0];
        for(int height : ar){
            if(!map.containsKey(height)){
                map.put(height, 1);
            }else {
                map.put(height, map.get(height)+1);
            }
            if(maxHeight<height){
                maxHeight = height;
            }
        }
        return map.get(maxHeight);
    }

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int numberOfCandle = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[numberOfCandle];
        String[] arrItem = scanner.nextLine().split(" ");
        int index = 0;
        for(String string : arrItem){
            arr[index++] = Integer.parseInt(string);
        }
        int result = birthdayCakeCandles(arr);
        System.out.println(result);
    }
}
