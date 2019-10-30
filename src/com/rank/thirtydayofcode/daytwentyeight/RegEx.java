package com.rank.thirtydayofcode.daytwentyeight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegEx {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nameValid = "\\b[a-z]{0,20}\\b";
        String emailValid = "\\b[a-z.]{0,50}@gmail.com\\b";
        int N = scanner.nextInt();
        scanner.skip("\n");

        List<String> validUserNames = new ArrayList<>();

        for (int NItr = 0; NItr<N; NItr++){
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            if (firstName.matches(nameValid)){
                if (emailID.matches(emailValid)){
                    validUserNames.add(firstName);
                }
            }
        }

        validUserNames.sort(String::compareTo);

        for (String name : validUserNames){
            System.out.println(name);
        }

        scanner.close();
    }
}
