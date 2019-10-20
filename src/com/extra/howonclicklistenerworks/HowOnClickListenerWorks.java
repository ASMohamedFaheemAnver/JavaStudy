package com.extra.howonclicklistenerworks;

public class HowOnClickListenerWorks {
    public static void main(String[] args){
        System.out.println(Float.MAX_VALUE);

        System.out.println(new SomeThing() {
            @Override
            void doSomething() {

            }

            @Override
            void doOtherThings() {

            }
        });
    }
}


abstract class SomeThing{
    abstract void doSomething();
    abstract void doOtherThings();
}
