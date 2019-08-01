package com.construction.inputReader;

public class CmdLineInput implements InputReader{
    String []args;

    public CmdLineInput(String[] args){
        this.args = args;
    }

    @Override
    public String get(){ return args[0]; }
}