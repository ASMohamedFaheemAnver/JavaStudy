package com.shecode;

import java.util.*;
import java.util.stream.Collectors;

public class LoveCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String boyName = scanner.nextLine();
        String girName = scanner.nextLine();

        Map<Character, Integer> boyMap = new TreeMap<>();
        Map<Character, Integer> girlMap = new TreeMap<>();

        for (char boyLetter : boyName.toCharArray()){
            if (!boyMap.containsKey(boyLetter)){
                boyMap.put(boyLetter, 1);
            }else {
                boyMap.put(boyLetter, boyMap.get(boyLetter) + 1);
            }
        }

        for (char boyLetter : girName.toCharArray()){
            if (!girlMap.containsKey(boyLetter)){
                girlMap.put(boyLetter, 1);
            }else {
                girlMap.put(boyLetter, girlMap.get(boyLetter) + 1);
            }
        }

        Map<Character, Integer> sortedBoyMap = boyMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        Map<Character, Integer> sortedGirlMap = boyMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        String boyOccur = String.valueOf((sortedBoyMap.keySet().toArray())[0]) + ((sortedBoyMap.keySet().toArray())[1]) + ((sortedBoyMap.keySet().toArray())[2]);
        String girlOccur = String.valueOf((sortedGirlMap.keySet().toArray())[0]) + ((sortedGirlMap.keySet().toArray())[1]) + ((sortedGirlMap.keySet().toArray())[2]);;
        int boyOccurTime = boyMap.get((sortedBoyMap.keySet().toArray())[0]);
        int girlOccurTime = girlMap.get((sortedGirlMap.keySet().toArray())[0]);

        System.out.println(boyOccur);
        System.out.println(girlOccur);

        if (boyOccur.equals(girlOccur)&&boyOccurTime==girlOccurTime){
            System.out.println("Match");
        }else {
            System.out.println("Not a Match");
        }
    }
}
