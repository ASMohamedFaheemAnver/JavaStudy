package com.acescoders;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RandomGroup {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSequence = scanner.nextInt();
        int numberOfInput = scanner.nextInt();
        int numberOfPairNeeded = scanner.nextInt();

        for (int i = 0; i < numberOfSequence; i++) { // O(n)
            Map<Integer, Integer> map = new HashMap<>();
            int generatedPairs = 0;
            boolean isBreak = false;
            for (int j = 0; j < numberOfInput; j++) { // O(n)
                int input = scanner.nextInt();

                if (map.containsKey(input)) { // O(n) doubt
                    int numberOfMembers = map.get(input);
                    if (numberOfMembers < 2) {
                        map.put(input, numberOfMembers + 1);
                        generatedPairs++;
                    } else if (numberOfMembers > 2) {
                        scanner.nextLine();
                        isBreak =true;
                        break;
                    }
                } else {
                    map.put(input, 1);
                }
            }
            if ((!isBreak)&&(generatedPairs == numberOfPairNeeded)) {
                System.out.println("SAFE");
            } else {
                System.out.println("NOT SAFE");
            }
        }
    }
}