package com.company.OOP;

public class Java_Inheritance {
    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }

    void sing(){
        System.out.println("I am singing");
    }
}



class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}