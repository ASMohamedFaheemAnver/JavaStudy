package com.rank.thirtydayofcode.daytwentyfive.practice;

import java.util.HashMap;
import java.util.Map;

public class RunTimeComplexityPractice {

    // Want to get answer

    public static int[] findNumberOfRepetitionsVersionOne(String s, char[] c){
        int sum[] = new int[c.length];

        for (int i = 0; i<s.length(); i++){
            for (int j = 0; j<c.length; j++){
                if (s.charAt(i)==c[j]){
                    sum[j]++;
                }
            }
        }

        return sum; // Big(O) n*m
    }

    public static int[] findNumberOfRepetitionsVersionTwo(String s, char[] c){
        int sum[] = new int[c.length];

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i<s.length(); i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }else {
                int total = map.get(s.charAt(i));
                map.put(s.charAt(i), total+1);
            }
        }

        for (int j = 0; j<c.length; j++){
            if (!map.containsKey(c[j])){ // How it became faster than Version one
                sum[j] = 0;
            }else {
                sum[j] = map.get(c[j]);
            }
        }

        return sum; // Big(O) (n+m)
    }


    public static void main(String[] args) throws InterruptedException {
        char[] c = {'a', 'b', 'c'};

        String string = "";

        for (int i = 0; i<100000; i++){
            string += "abc";
        }

        long startTime = System.currentTimeMillis();
        System.out.println(findNumberOfRepetitionsVersionOne(string, c));
        long endTime = System.currentTimeMillis();

        long different = endTime - startTime;
        System.out.println(startTime + " " + endTime + " " + different);

        startTime = System.currentTimeMillis();
        System.out.println(findNumberOfRepetitionsVersionTwo(string, c));
        endTime = System.currentTimeMillis();
        different = endTime - startTime;
        System.out.println(startTime + " " + endTime + " " + different);
    }
}
