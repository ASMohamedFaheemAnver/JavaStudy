package com.extra.interfaceandgetsetmethod;

import java.util.Map;

public class Controller {
    public static void main(String[] args){
        Repository testJava = new InterfaceImplementation();
        testJava.update(5);
        Map<String, Boolean> allFlags = testJava.getAllFlags();

        if(allFlags.get("FlagOne")){
            System.out.println("FlagOne is true");
        }
        if (allFlags.get("FlagTwo")){
            System.out.println("FlagTwo is true");
        }

        testJava.update(-1);

        if(allFlags.get("FlagOne")){
            System.out.println("FlagOne is true");
        }
        if (allFlags.get("FlagTwo")){
            System.out.println("FlagTwo is true");
        }
    }
}
