package com.extra.atom;

public class AtomCoordination {
    private double xCoordination;
    private double yCoordination;
    private double zCoordination;

    public AtomCoordination(){
        this.xCoordination = Math.random()*100;
        this.yCoordination = Math.random()*100;
        this.zCoordination = Math.random()*100;
    }


    public AtomCoordination(double xCoordination, double yCoordination, double zCoordination) {
        this.xCoordination = xCoordination;
        this.yCoordination = yCoordination;
        this.zCoordination = zCoordination;
    }

    public void updateCurrentCoordination(double changeInXCoordination, double changeInYCoordination, double changeInZCoordination){
        this.xCoordination += changeInXCoordination;
        this.yCoordination += changeInYCoordination;
        this.zCoordination += changeInZCoordination;
    }

    public void printCurrentCoordination(){
        System.out.println(this.xCoordination + " " + this.yCoordination + " " + this.zCoordination);
    }

}
