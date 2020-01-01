package com.extra.permutation;

public class SubSetSum {

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
    public static boolean isSubSetSumExistWithDuplicate(int[] set, int value, int max){
        int length = set.length;
        // We can change it to boolean
        int[] isPossible = new int[max];
        isPossible[0] = 1;

        for (int i = 0; i<length; i++){
            int val = set[i];
            if (isPossible[val]==1){
                continue;
            }
            for (int j = 0; j+val<max; j++){
                if (isPossible[value]==1){
                    return true;
                }
                if (isPossible[j]==1){
                    isPossible[j+val] = 1;
                }
            }
        }
        return false;
    }

    public static boolean isSubSetSumExistWithoutDuplicate(int[] set, int sum){
        int length = set.length;
        boolean[][] subSet = new boolean[sum+1][length+1];

        for (int i = 0; i<=sum; i++){
            subSet[i][0] = true;
        }

        for (int i = 1; i<=length; i++){
            subSet[i][0] = false;
        }

        for (int i = 1; i<=length; i++){
            for (int j = 1; j<=sum; j++){
                subSet[i][j] = subSet[i-1][j];
                if (i>=set[i-1]){
                    subSet[i][j] = subSet[i][j] || subSet[i - set[j-1]][j-1];
                }
            }
        }

        return subSet[sum][length];
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 5, 7};
        System.out.println(SubSetSum.isSubSetSumExistWithoutDuplicate(arr, 10));
    }
}