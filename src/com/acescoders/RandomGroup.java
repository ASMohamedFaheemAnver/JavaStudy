package com.acescoders;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RandomGroup {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int numberofsequance = scanner.nextInt();
        int numberofcard = scanner.nextInt();
        int numberofgroup = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i<numberofsequance; i++){
            int generatedgroup = 0;
            Map<Integer, Integer> newMap = new HashMap<Integer, Integer>();
            for(int j = 0; j<numberofcard; j++){
                int card = scanner.nextInt();
                if (newMap.containsKey(card)){
                    newMap.put(card, newMap.get(card)+1);
                }else {
                    newMap.put(card, 1);
                }
            }
            int notsafeexist = 0;
            for(int key : newMap.keySet()){
                if(newMap.get(key)==2){
                    generatedgroup++;
                }else if(newMap.get(key)>2){
                    notsafeexist++;
                }
            }
            if(generatedgroup==numberofgroup && notsafeexist == 0){
                System.out.println("SAFE");
            }else{
                System.out.println("NOT SAFE");
            }
        }
    }
}
