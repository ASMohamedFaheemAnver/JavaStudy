package com.timecomplexity.fastestio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UsingBufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberOfInput = Integer.parseInt(stringTokenizer.nextToken());
        int divider = Integer.parseInt(stringTokenizer.nextToken());

        int count = 0;
        while (numberOfInput-->0){
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number%divider==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
