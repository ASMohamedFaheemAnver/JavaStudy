package com.rank.thirtydayofcode.daynine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionarieandMap {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();
        Map<String, Integer> myMap = new HashMap<>();
        for(int index = 0; index<numberOfInput; index++){
            String name = scanner.next();
            int phone = scanner.nextInt();
            myMap.put(name, phone);
        }
        while (scanner.hasNext()){
            String search = scanner.next();
            if(myMap.containsKey(search)){
                System.out.println(search + "=" + myMap.get(search));
            }else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}
