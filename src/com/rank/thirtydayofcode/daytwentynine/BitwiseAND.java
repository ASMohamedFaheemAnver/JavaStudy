package com.rank.thirtydayofcode.daytwentynine;

public class BitwiseAND {

    static void BinaryString(String string){
        int i = 0;
        for (byte b : string.getBytes()){
            // System.out.print(Integer.toString(string.charAt(i++)) + " ");
            System.out.print(Integer.toBinaryString(b) + " ");
        }
        System.out.println();
    }

    static void BinaryInteger(Integer integer){
        System.out.println(Integer.toBinaryString(integer));
    }

    public static void main(String[] args){
        BinaryString("HackerRank");
        BinaryInteger(8675309);
    }
}
