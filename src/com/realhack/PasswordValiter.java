package com.realhack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValiter {
    public static String messageForUser(String password, int requiredPasswordLength){
        String numbersRegX = "[0-9]";
        String lower_caseRegX = "[a-z]";
        String upper_caseRegX = "[A-Z]";
        String special_charactersRegX = "[!|@|#|$|%|^|&|\\*|(|)|\\-|\\+]";

        Pattern numberPattern = Pattern.compile(numbersRegX);
        Pattern lower_casePattern = Pattern.compile(lower_caseRegX);
        Pattern upper_casePattern = Pattern.compile(upper_caseRegX);
        Pattern special_characterPattern = Pattern.compile(special_charactersRegX);

        Matcher numberMatcher = numberPattern.matcher(password);
        Matcher lower_caseMatcher = lower_casePattern.matcher(password);
        Matcher upper_caseMatcher = upper_casePattern.matcher(password);
        Matcher special_characterMatcher = special_characterPattern.matcher(password);



        int numberOfNumbers = 0;
        int numberOfLowerCharacters = 0;
        int numberOfUpperCharacters = 0;
        int numberOfSpecialCharacters = 0;

        while (numberMatcher.find()){
            numberOfNumbers++;
        }

        while (lower_caseMatcher.find()){
            numberOfLowerCharacters++;
        }

        while (upper_caseMatcher.find()){
            numberOfUpperCharacters++;
        }

        while (special_characterMatcher.find()){
            numberOfSpecialCharacters++;
        }

        if(numberOfNumbers>0&&numberOfLowerCharacters>0
            &&numberOfUpperCharacters>0&&numberOfSpecialCharacters>0
            &&requiredPasswordLength<=password.length()){
            return "Strong" + " " + numberOfNumbers + " " + numberOfLowerCharacters +
                    " " + numberOfUpperCharacters + " " + numberOfSpecialCharacters;
        }
        return "Weak" + " " + numberOfNumbers + " " + numberOfLowerCharacters +
                " " + numberOfUpperCharacters + " " + numberOfSpecialCharacters;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();
        int requiredPasswordLength = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> listOfPassword = new ArrayList<>();
        for (int i = 0; i<numberOfInput; i++){
            listOfPassword.add(scanner.nextLine());
        }
        for (String password : listOfPassword){
            System.out.println(messageForUser(password, requiredPasswordLength));
        }
    }
}
