package com.rank.thirtydayofcode.daytwenty;

import java.util.Scanner;
interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic{
    @Override
    public int divisorSum(int n){
        int sum = 0;
        for(int i = 1; i<n+1; i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum;
    }
}

public class InterfaceClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
