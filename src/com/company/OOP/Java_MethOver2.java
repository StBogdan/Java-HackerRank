package com.company.OOP;

public class Java_MethOver2 {
    public static void main(String []args){
        MotorCycle M=new MotorCycle();
    }
}

class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        String temp=super.define_me(); //Fix this line
        System.out.println("Hello I am a motorcycle, I am "+ define_me());
		System.out.println("My ancestor is a cycle who is "+ temp );
    }
}