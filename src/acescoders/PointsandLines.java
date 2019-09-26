package acescoders;

import java.util.Scanner;

public class PointsandLines {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfPoints = scanner.nextInt();
        int[][] xyPoints = new int[numberOfPoints][2];
        for(int index = 0; index<numberOfPoints; index++){
            xyPoints[index][0] = scanner.nextInt();
            xyPoints[index][1] = scanner.nextInt();
        }
        boolean isInvalid = false;
        int[][] lineIndex = new int[2][numberOfPoints];
        for(int index = 0; index<numberOfPoints; index++){
            lineIndex[0][index] = -1;
            lineIndex[1][index] = -1;
        }
        int j = 0;
        int i = 0;
        for (int index = 0; index<numberOfPoints; index++){
            if(2==(xyPoints[index][1]-xyPoints[index][0])){
                lineIndex[0][i] = index;
                i++;
            }else if(1==(xyPoints[index][1]-xyPoints[index][0])){
                lineIndex[1][j] =index;
                j++;
            }else {
                isInvalid = true;
            }
        }
        if (!isInvalid){
            for (int index: lineIndex[1]){
                if(index!=-1)
                    System.out.print(index + " ");
            }
            System.out.println();
            for (int index: lineIndex[0]){
                if(index!=-1)
                    System.out.print(index + " ");
            }
        }else {
            System.out.println(-1);
        }
    }
}
