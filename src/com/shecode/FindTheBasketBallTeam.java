package com.shecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindTheBasketBallTeam {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfStudent = scanner.nextInt();
        scanner.skip("\n");
        List<Integer> allHeight = new ArrayList<>();

        for (int i = 0; i<numberOfStudent; i++){
            int heightOfStudent = scanner.nextInt();
            allHeight.add(heightOfStudent);
        }

        allHeight.sort(Collections.reverseOrder());

        for (int i = 0; i<7; i++){
            System.out.println(allHeight.get(i));
        }
    }
}
