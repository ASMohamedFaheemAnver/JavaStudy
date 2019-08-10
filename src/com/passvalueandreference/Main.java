package com.passvalueandreference;
class variable{
    public int numberOne = 6;
    public int numberTwo = 9;
}


public class Main {
    public static int numberOnex = 8;
    public static int numberTwox = 13;
    public static void main(String[] args){
        ValueandReference example = new ValueandReference();

        // Logical passing
        int numberOne = 3;
        int numberTwo = 7;
        example.sample(numberOne, numberTwo);
        System.out.printf("%d %d\n", numberOne, numberTwo);

        // Create a class and pass It
        variable values = new variable();
        example.sample(values);
        System.out.printf("%d %d\n", values.numberOne, values.numberTwo);

        // Making static variable
        example.sample(numberOnex, numberTwox);
        System.out.printf("%d %d\n", numberOnex, numberTwox);

        // Making a array and pass It
        int[] valueArray = {4, 5};
        example.sample(valueArray);
        System.out.printf("%d %d\n", valueArray[0], valueArray[1]);
    }
}
