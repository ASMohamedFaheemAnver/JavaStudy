package com.extra.interfaceandgetsetmethod;

import java.util.HashMap;
import java.util.Map;

public class InterfaceImplementation implements Repository{
    private String flagOne = "FlagOne";
    private boolean flagOneValue = false;
    private String flagTwo = "FlagTwo";
    private boolean flagTwoValue = false;

    private Map<String, Boolean> allFlags;

    InterfaceImplementation(){
        allFlags = new HashMap<>();
        allFlags.put(flagOne, flagOneValue);
        allFlags.put(flagTwo, flagTwoValue);

    }

    @Override
    public void update(int data) {
        if (data<0){
            allFlags.put(flagOne, true);
        }else {
            allFlags.put(flagTwo, true);
        }
    }

    @Override
    public Map getAllFlags() {
        return allFlags;
    }
}
