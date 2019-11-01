package com.rank.algorithm;

import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int homeBeginning = scanner.nextInt();
        int homeEnding = scanner.nextInt();

        int appleTreePosition = scanner.nextInt();
        int orangeTreePosition = scanner.nextInt();

        int countOfApple = scanner.nextInt();
        int countOfOrange = scanner.nextInt();

        int count = 0;
        for (int i = 0; i<countOfApple; i++){
            int newApplePosition = scanner.nextInt() + appleTreePosition;
            if ((newApplePosition>=homeBeginning)&&(newApplePosition<=homeEnding)){
                count++;
            }
        }
        System.out.println(count);

        count = 0;
        for (int i = 0; i<countOfOrange; i++){
            int newOrangePosition = scanner.nextInt() + orangeTreePosition;
            if ((newOrangePosition<=homeEnding)&&(newOrangePosition>=homeBeginning)){
                count++;
            }
        }
        System.out.println(count);
    }
}
