package com.extra.permutation;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
    public static ArrayList<String> permutation(String string){
        String prefix = "";
        ArrayList<String> result = new ArrayList<>();
        permutation(prefix, string, result);
        return result;
    }

    public static void permutation(String prefix, String suffix, ArrayList<String> result){
        if (suffix.length()==0){
            result.add(prefix);
        }else {
            for (int i = 0; i<suffix.length(); i++){
                permutation(prefix + suffix.charAt(i), suffix.substring(0,i) + suffix.substring(i+1), result);
            }
        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for (String oneEle : Permutation.permutation(scanner.nextLine())){
            System.out.println(oneEle);
        }
    }
}
