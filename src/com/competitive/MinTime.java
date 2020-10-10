package com.competitive;

import java.util.Scanner;

public class MinTime {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int not = scanner.nextInt();
        for (int i = 0; i<not; i++){
            int nos = scanner.nextInt();
            scanner.nextLine();
            int si[] = new int[nos];
            String ss[] = scanner.nextLine().split(" ");
            for(int x = 0; x<ss.length; x++){
                si[x] = Integer.parseInt(ss[x]);
            }

            for (int j = 0; j<nos; j++) {
                int ts = 0;
                for (int jh = 0; jh < nos; jh++) {
                    if ((jh != j) && si[jh] == 1) {
                        ts += Math.abs(jh - j);
                    }
                }
                System.out.print(ts + " ");
            }
            System.out.println();
        }
    }
}
