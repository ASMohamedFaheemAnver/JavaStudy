package com.rank.shecode;

import java.util.*;

public class WeirdATM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int neededMoney = scanner.nextInt();
        List<Integer> listOfNote = new ArrayList<>();
        scanner.skip("\n");

        String string = scanner.nextLine().replaceAll("\\s+", "");

        for (String node : string.split(",")){
            listOfNote.add(Integer.valueOf(node));
        }

        Collections.sort(listOfNote);

        boolean isExist = false;
        for (int oneMoney : listOfNote){
            if (neededMoney%oneMoney==0){
                isExist = true;
                break;
            }
        }

        if (isExist){
            System.out.println("ACCEPTED");
        }else {
            System.out.println("REJECTED");
        }

    }
}
