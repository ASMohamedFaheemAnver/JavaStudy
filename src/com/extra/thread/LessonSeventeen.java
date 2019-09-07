package com.extra.thread;

public class LessonSeventeen {
    public static void main(String[] args){
        Thread getTime = new GetTime();
        Runnable getMail = new GetMail(10);
        Runnable getMailAgain = new GetMail(20);
        getTime.start();
        new Thread(getMail).start();
        new Thread(getMailAgain).start();
    }
}
