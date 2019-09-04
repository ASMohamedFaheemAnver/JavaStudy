package com.rank.thirtydayofcode.dayseven;

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i<numberOfInput; i++){
            String sOne = "";
            String sTwo = "";
            String string = scanner.nextLine();
            for(int j = 0; j<string.length(); j++){
                if(j%2!=0){
                    sTwo += string.charAt(j);
                }else {
                    sOne += string.charAt(j);
                }
            }
            System.out.println(sOne + " " + sTwo);
        }
    }
}
