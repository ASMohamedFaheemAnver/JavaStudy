package com.extra.memoryandtime;

import java.util.concurrent.TimeUnit;

public class MemoryUsedTimeComplexity {
    public static void main(String[] args) throws InterruptedException {
        long beforeUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        long oldTime = System.currentTimeMillis();
        String a = "";
        for (int i = 0; i<100000; i++){
            // To Do
            // TimeUnit.SECONDS.sleep(1);
            a += "abc";
        }
        long newTime = System.currentTimeMillis();

        long differentInTime = newTime - oldTime;

        long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        long actualMemoryUsed = afterUsedMem - beforeUsedMem;
        System.out.println(differentInTime/1000L);
        System.out.println(actualMemoryUsed/(1024L*1024L));
    }
}
