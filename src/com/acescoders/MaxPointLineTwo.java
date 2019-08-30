package com.acescoders;

import com.acescoders.data.Point;

public class MaxPointLineTwo {
    public static int maxPoints(Point[] points){
        int length = points.length;
        if(length<3){
            return length;
        }
        int max = 2;
        for(int i = 1; i<length; i++){
            int count = 0;
            long xOne = points[i-1].x;
            long yOne = points[i-1].y;
            long xTwo = points[i].x;
            long yTwo = points[i].y;

            if (xOne==xTwo && yOne==yTwo){
                for(int j = 0; j<length; j++){
                    if (points[j].x==xOne && points[j].y==yOne){
                        count++;
                    }
                }
            }else {
                for (int j = 0; j<length; j++){
                    if ((points[j].y - yTwo)*(xTwo - xOne)==(yTwo - yOne)*(points[j].x - xTwo)){
                        count++;
                    }
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args){
        Point[] x = new Point[5];
        x[0] = new Point(9, 11);
        x[1] = new Point(2, 4);
        x[2] = new Point(8, 9);
        x[3] = new Point(5, 7);
        x[4] = new Point(2, 3);
        System.out.println(maxPoints(x));
    }
}
