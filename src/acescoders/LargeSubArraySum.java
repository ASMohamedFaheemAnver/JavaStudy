package acescoders;

import java.util.Scanner;

public class LargeSubArraySum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int minNum = scanner.nextInt();
        int maxNum = scanner.nextInt();
        int moduloNum = scanner.nextInt();
        int sum = 0;
        for(int i = minNum; i<maxNum+2; i++){
            for (int j = i; j<maxNum+2; j++){
                for (int x = i; x<j; x++){
                    sum += x;
                }
            }
        }
        System.out.println(sum%moduloNum);
    }
}
