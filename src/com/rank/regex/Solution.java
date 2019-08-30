package com.rank.regex;

import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    /*
    * \\d : digit
    * \\d{1,2} : 1 to 2 digit eg. [0-9] or [0-9][0-9]
    * \\2[0-4] : 20 to 24
    * \\[01] : 0 or 1
    */
    String acceptable = "(\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])";
    String dot = ".";
    public String pattern = acceptable+dot+acceptable+dot+acceptable+dot+acceptable;
}