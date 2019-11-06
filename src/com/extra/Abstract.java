package com.extra;

public class Abstract {
    public static void main(String[] args){
        Something x = new Something() {
            @Override
            void doSomethingOne(String args) {

            }

            @Override
            void doSomethingTwo() {

            }
        };

        x.doSomethingOne("");
    }
}

abstract class Something{
    abstract void doSomethingOne(String args);
    abstract void doSomethingTwo();
}