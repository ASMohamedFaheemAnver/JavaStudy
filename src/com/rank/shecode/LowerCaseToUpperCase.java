package com.rank.shecode;
import java.util.Scanner;

public class LowerCaseToUpperCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean isUpper = true;

        while (scanner.hasNext()){
            String string = scanner.next();
            if (isUpper){
                System.out.print(string.charAt(0) + string.substring(1).toLowerCase() + " ");
            }else {
                System.out.print(string.toLowerCase() + " ");
            }
            if (string.endsWith(".")){
                isUpper = true;
            }else {
                isUpper = false;
            }
        }
    }
}
