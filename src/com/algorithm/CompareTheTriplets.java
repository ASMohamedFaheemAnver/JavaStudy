package com.algorithm;


import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> output = new ArrayList<>();
        int apoint = 0;
        int bpoint = 0;
        for(int i = 0; i<3; i++){
            if(a.get(i)>b.get(i)){
                apoint++;
            }else if (a.get(i)<b.get(i)){
                bpoint++;
            }
        }
        output.add(apoint);
        output.add(bpoint);
        return output;
    }
}
