package com.semaphores;


public class DiningPhilosophers {
    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[5];
        Object[] forks = new Object[philosophers.length];

        for(int i = 0; i<philosophers.length; i++){
            forks[i] = new Object();
        }

            for(int i = 0; i<forks.length; i++){
                Object leftFork = forks[i];
                Object rightFork = forks[(i+1)%philosophers.length];
                if(i!=(philosophers.length -1)){
                    philosophers[i] = new Philosopher(leftFork, rightFork);


                }else{
                    philosophers[i] = new Philosopher(rightFork, leftFork);
                }
                Thread t = new Thread(philosophers[i], "Philosopher " + (i+1));
                t.start();
            }
    }
}
