package com.acescoders;

import java.util.*;

public class RichestDay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberofproject = scanner.nextInt();
        List<Map<Integer, Integer>> listofdaysalary = new ArrayList<Map<Integer, Integer>>();

        for(int i = 1; i<numberofproject+1; i++){
            int salary = scanner.nextInt();
            int startingdate = scanner.nextInt();
            int enddingdate = scanner.nextInt();
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int j = 1; j<enddingdate+1; j++){
                if (j>startingdate-1){
                    map.put(j, salary);
                }
            }
            listofdaysalary.add(map);
        }
        int[] total = new int[numberofproject];

        int index = 0;
        for (Map map: listofdaysalary) {
            while (map.get(index+1)==null){
                try {
                    total[index] += Integer.parseInt(String.valueOf(map.get(index+1)));
                }catch (ArrayIndexOutOfBoundsException e){
                    break;
                }catch (NumberFormatException e){
                    total[index] += 0;
                }
                index++;
            }
        }
        for (int i = 0; i<numberofproject; i++){
            System.out.println(total[i]);
        }
    }
}