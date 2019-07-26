package com.extra;

// https://www.geeksforgeeks.org/main-thread-java/
public class Deadlocking {
    public static void main(String[] args){
        System.out.println("Deadlock!");
        try {
            Thread.currentThread().join();
            System.out.println("You can't see me dude!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}