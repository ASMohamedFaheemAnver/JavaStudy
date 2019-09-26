package com.extra.thread;

public class LessonSeventeen {
    public static void main(String[] args){
        GetTime getTime = new GetTime();
        Runnable getMail = new GetMail(10);
        Runnable getMailAgain = new GetMail(20);

        // getTime.run(); If we didn't extent Thread in GetTime,
        // It won't allow thread to process simultaneously
        getTime.run();
        new Thread(getMail).start();
        new Thread(getMailAgain).start();
    }
}
