package com.shecode;
import java.util.Scanner;

// https://www.geeksforgeeks.org/subset-sum-problem-dp-25/

class SubSetSum {

    // Big O(2^N)
//    public static boolean isSubSetSumExist(int[] set, int length, int sum){
//        if (sum==0){
//            return true;
//        }
//
//        if (length==0 && sum!=0){
//            return false;
//        }
//
//        if (set[length-1]>sum){
//            return isSubSetSumExist(set, length-1, sum);
//        }
//        // We check with not adding the next element || adding the next element
//        // https://www.youtube.com/watch?v=kyLxTdsT8ws
//        return isSubSetSumExist(set, length-1, sum) || isSubSetSumExist(set, length-1, sum - set[length-1]);
//    }

    // https://www.geeksforgeeks.org/check-if-is-possible-to-get-given-sum-from-a-given-set-of-elements/
    public static boolean isSubSetSumExist(int[] set, int value, int max){
        int length = set.length;
        // We can change this array to boolean
        int[] isPossible = new int[max];
        isPossible[0] = 1;

        for (int i = 0; i<length; i++){
            int val = set[i];
            if (isPossible[val]==1){
                continue;
            }
            for (int j = 0; j+val<max; j++){
                if (isPossible[j]==1){
                    isPossible[j+val] = 1;
                }
                if (isPossible[value]==1){
                    return true;
                }
            }
        }
        return false;
    }
}

public class WeirdATM {
    // Finding a combination sum in a given set
    // https://stackoverflow.com/questions/4632322/finding-all-possible-combinations-of-numbers-to-reach-a-given-sum

    // https://www.geeksforgeeks.org/check-if-is-possible-to-get-given-sum-from-a-given-set-of-elements/
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int totalMoneyNeeded = scanner.nextInt();
        scanner.skip("\n");

        int[] set = new int[7];

        int index = 0;
        for (String node : scanner.nextLine().split(",")){
            set[index++] = Integer.parseInt(node.replaceAll("\\s+", ""));
        }
        if (totalMoneyNeeded>0&&totalMoneyNeeded<=1000000){
            // We add max as totalMoneyNeeded+5000 because if we pass max as totalMoneyNeed and
            // int[]{5000, ..} it will give arrayIndexOutOfBoundsException
            if (SubSetSum.isSubSetSumExist(set, totalMoneyNeeded, totalMoneyNeeded+5000)){
                System.out.println("ACCEPTED");
            }else {
                System.out.println("REJECTED");
            }
        }
    }
}
