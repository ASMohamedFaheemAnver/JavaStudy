package com.passvalueandreference;


public class ValueandReference {
    void sample(int numberOne, int numberTwo){
        int temp = numberOne;
        numberOne = numberTwo;
        numberTwo = temp;
    }
    void sample(variable numbers){
        int temp = numbers.numberOne;
        numbers.numberOne = numbers.numberTwo;
        numbers.numberTwo = temp;
    }

    public void sample(int[] valueArray) {
        int temp = valueArray[0];
        valueArray[0] = valueArray[1];
        valueArray[1] = temp;
    }
}
