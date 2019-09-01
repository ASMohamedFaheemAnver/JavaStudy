package com.extra;

public class ArrayInJava {
    static int[] returnmeDude(){
        return new int[]{1,2,3};
    }
    public static void main(String[] args){
        int[] test = new int[]{0, 1, 2};
        for(int i: returnmeDude()){
            System.out.println(i);
        }
        for(int i: test){
            System.out.println(i);
        }
    }
}
