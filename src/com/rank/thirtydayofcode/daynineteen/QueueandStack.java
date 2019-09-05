package com.rank.thirtydayofcode.daynineteen;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueandStack {
    private Stack<Character> stack = new Stack<Character>();
    private Queue<Character> queue = new LinkedList<>();
    void pushCharacter(char c){
        stack.push(c);
    }

    void enqueueCharacter(char c){
        queue.add(c);
    }

    char popCharacter(){
        return stack.pop();
    }

    char dequeueCharacter(){
        return queue.remove();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        char[] s = input.toCharArray();
        QueueandStack p = new QueueandStack();

        for(char c : s){
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for(int i = 0; i<s.length/2; i++){
            if(p.popCharacter()!=p.dequeueCharacter()){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
