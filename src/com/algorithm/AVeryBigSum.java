package com.algorithm;

public class AVeryBigSum {
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for(long x: ar){
            sum += x;
        }
        return  sum;
    }
}
