package com.rank.thirtydayofcode.daythree;

import java.util.Scanner;

public class Operator {
    static void solve(double mealCost, int tipPercent, int taxPercent){
        System.out.println(Math.round(mealCost + ((double)tipPercent/100)*mealCost + ((double)taxPercent/100)*mealCost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        double mealCost = scanner.nextDouble();
        int tipPercent = scanner.nextInt();
        int taxPercent = scanner.nextInt();

        solve(mealCost, tipPercent, taxPercent);
    }
}
