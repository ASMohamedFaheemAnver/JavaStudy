package com.shecode;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        char[] numberTwo = {'a', 'b', 'c'};

        Scanner scanner = new Scanner(System.in);

        int numberOfInput = scanner.nextInt();
        scanner.skip("\n");
        for (int i = 0; i<numberOfInput; i++){
            String string = scanner.nextLine();
            String result = String.valueOf(string.charAt(0));
            int count = 1;

            if (string.length()==1){
                result += count;
            }else {
                for (int j = 1; j<string.length(); j++){
                    if (string.charAt(j) != string.charAt(j-1)){
                        result += count + String.valueOf(string.charAt(j));
                        count = 1;
                    }else {
                        count++;
                    }
                    if (i==string.length()-1){
                        result += count;
                    }
                }
            }
            for (int index = 0; index<result.length(); index+=2){
              int type = result.charAt(index);
            }
        }
    }
}
