package com.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
       int difference = 0;
       int front = 0;
       int back = arr.size()-1;
       int frontDiagonal = 0;
       int backDiagonal = 0;

       for(int i = 0; i<arr.size(); i++){
           frontDiagonal += arr.get(i).get(front);
           backDiagonal += arr.get(i).get(back);
           front++;
           back--;
       }
       difference = Math.abs(frontDiagonal-backDiagonal);
       return difference;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<List<Integer>> arr = new ArrayList<>();

        for(int i = 0; i<num; i++){
            List<Integer> sample = new ArrayList<>();
            for (int j = 0; j<num; j++){
                sample.add(scanner.nextInt());
            }
            arr.add(sample);
        }

        System.out.println(diagonalDifference(arr));
    }
}
