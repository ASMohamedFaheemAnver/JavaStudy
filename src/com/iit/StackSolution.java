package com.iit;

import java.util.Scanner;
import java.util.Stack;

public class StackSolution {
    public static  void main(String args[]){
        Stack<String> theStack = new Stack<String>();
        PrintReverse ob = new PrintReverse();
        ob.inputSentence(theStack);
        ob.printSentence(theStack);
    }


}

class PrintReverse {
    Scanner scanner = new Scanner(System.in);
    void inputSentence(Stack theStack){
        System.out.println("Enter the first work in your sentence");
        boolean isOut = false;
        while (!isOut){
            String input = scanner.nextLine();
            theStack.push(input);
            if(input.contains(".")){
                isOut = true;
            }else {
                System.out.println("Enter a word by word");
            }

        }
    }

    void printSentence(Stack theStack){
        System.out.println("Reverse sentence");
        while (!theStack.isEmpty()){
            System.out.println(theStack.pop());
        }
    }
}