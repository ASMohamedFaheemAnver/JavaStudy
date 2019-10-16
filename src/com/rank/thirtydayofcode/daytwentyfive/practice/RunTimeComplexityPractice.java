package com.rank.thirtydayofcode.daytwentyfive.practice;

import java.util.HashMap;
import java.util.Map;

public class RunTimeComplexityPractice {

    public static int[] findNumberOfRepetitionsVersionOne(String s, char[] c){
        int sum[] = new int[c.length];

        for (int i = 0; i<s.length(); i++){
            for (int j = 0; j<c.length; j++){
                if (s.charAt(i)==c[j]){
                    sum[j]++;
                }
            }
        }

        return sum;
    }

    public static int[] findNumberOfRepetitionsVersionTwo(String s, char[] c){
        int sum[] = new int[c.length];

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i<s.length(); i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }else {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }

        for (int j = 0; j<c.length; j++){
            if (!map.containsKey(c[j])){
                sum[j] = 0;
            }else {
                sum[j] = map.get(c[j]);
            }
        }

        return sum;
    }


    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        char[] c = {'a', 'b', 'c'};

        for (int x : findNumberOfRepetitionsVersionTwo("aaaaaaaaaabbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", c)){
            System.out.print(x + " ");
        }
        System.out.println();

        long endTime = System.currentTimeMillis();

        long difference = endTime - startTime;

        System.out.println(difference + "ms");
    }
}
