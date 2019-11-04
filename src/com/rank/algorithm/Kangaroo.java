package com.rank.algorithm;

import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        short kangarooOneStartingPosition = scanner.nextShort();
        short kangarooOneVelocity = scanner.nextShort();
        short kangarooTwoStartingPosition = scanner.nextShort();
        short kangarooTwoVelocity = scanner.nextShort();

        if (kangarooOneVelocity<=kangarooTwoVelocity){
            System.out.println("NO");
            System.exit(0);
        }

        int firstKangaroosPosition = kangarooOneStartingPosition;
        int secondKangaroosPosition = kangarooTwoStartingPosition;
        while (true){
            firstKangaroosPosition += kangarooOneVelocity;
            secondKangaroosPosition += kangarooTwoVelocity;
            if (firstKangaroosPosition==secondKangaroosPosition){
                System.out.println("YES");
                System.exit(0);
            }else if (firstKangaroosPosition>secondKangaroosPosition){
                System.out.println("NO");
                System.exit(0);
            }
        }
    }
}
