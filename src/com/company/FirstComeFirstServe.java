package com.company;

import java.util.Scanner;

public class FirstComeFirstServe{
    public static void main(String[] args){
        Scanner myRiFa = new Scanner(System.in);

        System.out.print("Enter number of processed : ");
        int numOfProcess = myRiFa.nextInt();
        System.out.println();

        myRiFa.nextLine(); //Cleaning the buffer to avoid '/n'

        System.out.print("Enter each process arrival time(ms) and CPU burst : ");
        String timeandBurst = myRiFa.nextLine();
        System.out.println();
        String[] spitedString = timeandBurst.split("[|]");

        int[] processID = new int[numOfProcess];
        int[] arrivalTime = new int[numOfProcess];
        int[] burstTime = new int[numOfProcess];
        int[] completingTime = new int[numOfProcess];
        int[] turnArroundTime = new int[numOfProcess];
        int[] waitingTime = new int[numOfProcess];
        int[] responseTime = new int[numOfProcess];

        int arrIndex = 0;
        for (String temp: spitedString){
            String[] temInt = temp.split(",");
            int[] x = new int[numOfProcess];
            int index = 0;
            for(String getInt: temInt){
                getInt = getInt.replaceAll("[^0-9?!\\.]","");
                x[index] = Integer.parseInt(getInt);
                index++;
            }
                processID[arrIndex] = x[0];
                arrivalTime[arrIndex] = x[1];
                burstTime[arrIndex] = x[2];
                arrIndex++;
        }
        for(int indexOne = 0; indexOne<numOfProcess; indexOne++){
            for(int indexTwo = indexOne+1; indexTwo<numOfProcess; indexTwo++){
                if(arrivalTime[indexOne]>arrivalTime[indexTwo]){
                    int temp;
                    temp = arrivalTime[indexOne];
                    arrivalTime[indexOne] = arrivalTime[indexTwo];
                    arrivalTime[indexTwo] = temp;

                    temp = processID[indexOne];
                    processID[indexOne] = processID[indexTwo];
                    processID[indexTwo] = temp;

                    temp = burstTime[indexOne];
                    burstTime[indexOne] = burstTime[indexTwo];
                    burstTime[indexTwo] = temp;
                }
            }
        }

        completingTime[0] = burstTime[0] + arrivalTime[0];
        for (int index = 1; index<numOfProcess; index++){
            completingTime[index] = completingTime[index-1] + burstTime[index];
        }

        for(int index = 0; index<numOfProcess; index++){
            turnArroundTime[index] = completingTime[index] - arrivalTime[index];
            waitingTime[index] = turnArroundTime[index] - burstTime[index];
            responseTime[index] = completingTime[index] - burstTime[index];
        }

        int totalTurnarroundtime = 0;
        int totalWaitingtime = 0;
        for (int index = 0; index<numOfProcess; index++){
            totalTurnarroundtime += turnArroundTime[index];
            totalWaitingtime += waitingTime[index];
        }

        float avgTurnarroundtime = (float)totalTurnarroundtime/numOfProcess;
        float avgWatingtime = (float)totalWaitingtime/numOfProcess;

        System.out.printf("%s\t| %s\t| %s\t| %s\t\n", "Process", "Turnaround time", "Response time", "Waiting time");
        System.out.println();
        for (int index = 0; index<numOfProcess; index++){
            System.out.printf("%d\t\t\t\t%d\t\t\t\t\t%d\t\t\t\t%d\n", processID[index], turnArroundTime[index], responseTime[index], waitingTime[index]);
            System.out.println();
        }

        System.out.printf("%s %.0fms\n\n", "Average turnarround time : ", avgTurnarroundtime);
        System.out.printf("%s %.0fms\n\n", "Average waiting time : ", avgWatingtime);
    }
}