package com.mylibrary;

import java.util.Scanner;

class MyNode{
    int data;
    MyNode next;

    MyNode(int data){
        this.data = data;
        next = null;
    }
}

public class MyMap {
    private MyNode topNode;

    void put(int data){
        MyNode newNode = new MyNode(data);
        if (topNode==null){
            topNode = newNode;
        }else {
            topNode.next = newNode;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        MyMap map = new MyMap();
        for (int i = 0; i<number; i++){
            map.put(i);
        }
    }
}
