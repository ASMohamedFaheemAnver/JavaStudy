package com.rank.thirtydayofcode.dayfive;

import java.util.Scanner;

class Person{
    private int age;
    public Person(int initialAge){
        if(initialAge>0){
            this.age = initialAge;
        }else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }
    public void amIOld(){
        String amIOldstring;
        if (age<13){
            amIOldstring = "You are young.";
        }else if(age>=13 && age<18){
            amIOldstring = "You are a teenager.";
        }else {
            amIOldstring = "You are old.";
        }
        System.out.println(amIOldstring);
    }

    public void yearPasses(){
        this.age++;
    }

}

public class ClassvsInstance {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();
        for(int i = 0; i<numberOfInput; i++){
            Person person = new Person(scanner.nextInt());
            person.amIOld();
            for(int j = 0; j < 3; j++){
                person.yearPasses();
            }
            person.amIOld();
            System.out.println();
        }
        scanner.close();
    }
}
