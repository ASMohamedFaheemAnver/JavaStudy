package com.rank.thirtydayofcode.daytwentytwo;

class Printer <T>{
    void printArray(T[] Array){
        for(T item : Array){
            System.out.println(item);
        }
    }
}

public class Generic {

    public static <E> void printArray(E[] array){
        for(E item : array){
            System.out.println(item);
        }
    }

    public static <T extends Comparable<T>> T findMax(T a, T b){
        int n = a.compareTo(b);
        if(n<0){
            return b;
        }else {
            return a;
        }
    }

    public static void main(String[] args){
        Integer[] item = {2, 5, 5, 6, 6};
        printArray(item);
        System.out.println(findMax(2, 3));
        System.out.println(findMax(6, 2));
    }
}
