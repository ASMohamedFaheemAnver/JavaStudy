package com.rank.thirtydayofcode.daytwentynine;

import java.util.Scanner;

public class BitwiseANDQs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.skip("\n");

        for (int index = 0; index<t; index++){
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            int maxBitAND = 0;
            for (int a = 1; a<n+1; a++){
                for(int b = a+1; b<n+1; b++){
                    int bitMul = a&b;
                    if ((bitMul<k)&&(bitMul>maxBitAND)){
                        maxBitAND = bitMul;
                    }
                }
            }
            System.out.println(maxBitAND);
        }

        scanner.close();
    }
}
