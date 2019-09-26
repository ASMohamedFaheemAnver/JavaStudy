package acescoders;

import java.util.*;

public class RichestDay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberofproject = scanner.nextInt();
        List<Map<Integer, Integer>> listofdaysalary = new ArrayList<Map<Integer, Integer>>();
        int maxend = 0;
        for(int i = 1; i<numberofproject+1; i++){
            int salary = scanner.nextInt();
            int startingdate = scanner.nextInt();
            int enddingdate = scanner.nextInt();
            if(maxend < enddingdate){
                maxend = enddingdate;
            }
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int j = 1; j<enddingdate+1; j++){
                if (j>startingdate-1){
                    map.put(j, salary);
                }
            }
            listofdaysalary.add(map);
        }
        int[] total = new int[maxend];

        for (Map map: listofdaysalary) {
            int index = 0;
            while (index<maxend){
                if(map.containsKey(index+1)){
                    int x = (int) map.get(index+1);
                    total[index] += x;
                }
                index++;
            }
        }
        int richmoney = 0;
        for (int i = 0; i<maxend; i++){
            if (richmoney<total[i]){
                richmoney = total[i];
            }
        }
        System.out.println(richmoney);
    }
}