package com.extra;

public class Student {
}

class Exam extends Student{

}

class Result extends Exam implements Sports{

    @Override
    public void play() {

    }
}

interface Sports{
    void play();
}