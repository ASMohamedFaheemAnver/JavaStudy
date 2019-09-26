package acescoders;

import acescoders.data.Point;

import java.util.Scanner;

public class MaxPointLineTwo {
    public static int[] maxPoints(Point[] points){
        int length = points.length;
        int[] maxindex = new int[length];
        if(length<3){
            for(int x = 0; x<length; x++){
                maxindex[x] = points[x].index;
            }
            return maxindex;
        }
        int max = 0;
        for(int i = 1; i<length; i++){
            int count = 0;
            long xOne = points[i-1].x;
            long yOne = points[i-1].y;
            long xTwo = points[i].x;
            long yTwo = points[i].y;
            int nu = 0;
            int[] index = new int[length];
            for (int j = 0; j<length; j++){
                index[j] = -1;
            }
            if (xOne==xTwo && yOne==yTwo){
                for(int j = 0; j<length; j++){
                    if (points[j].x==xOne && points[j].y==yOne){
                        count++;
                        index[nu++] = points[j].index;
                    }
                }
            }else {
                for (int j = 0; j<length; j++){
                    if ((points[j].y - yTwo)*(xTwo - xOne)==(yTwo - yOne)*(points[j].x - xTwo)){
                        count++;
                        index[nu++] = points[j].index;
                    }
                }
            }
            if(max < Math.max(max, count)){
                max = Math.max(max, count);
                maxindex = index;
            }
        }
        return maxindex;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfPoints = scanner.nextInt();
        Point[] xyPoints = new Point[numberOfPoints];
        int[] indexArray = new int[numberOfPoints];
        for(int index = 0; index<numberOfPoints; index++){
            indexArray[index] = index;
            xyPoints[index] = new Point();
            xyPoints[index].x = scanner.nextInt();
            xyPoints[index].y = scanner.nextInt();
            xyPoints[index].index = index;
        }

        boolean isLength = true;

        if(numberOfPoints<5){
            isLength = false;
        }

        int removedlength = 0;
        boolean lineone = false;
        boolean linetwo = false;

        int howmanypoints = 0;
        for (int x: maxPoints(xyPoints)) {
            if(x!=-1){
                indexArray[x] = -1;
                howmanypoints++;
                removedlength++;
            }
        }
        if(howmanypoints>=2){
            lineone = true;
        }
        Point[] xySecondPoints = new Point[numberOfPoints-removedlength];
        int secondindex = 0;
        for (int index = 0; index<numberOfPoints; index++){
            if (indexArray[index]!=-1){
                xySecondPoints[secondindex++] = xyPoints[index];
            }
        }
        howmanypoints = 0;
        for (int x: maxPoints(xySecondPoints)) {
            if(x!=-1){
                howmanypoints++;
                indexArray[x] = -1;
            }
        }
        if (howmanypoints>=2){
            linetwo = true;
        }

        boolean invalid = false;
        for (int x: indexArray){
            if (x!=-1){
                invalid = true;
            }
        }

        if(!invalid && lineone && linetwo & isLength){
            for (int x: maxPoints(xyPoints)){
                if(x!=-1){
                    System.out.print(x + " ");
                }
            }
            System.out.println();
            for (int x: maxPoints(xySecondPoints)){
                if(x!=-1){
                    System.out.print(x + " ");
                }
            }
        }else {
            System.out.println(-1);
        }
    }
}
