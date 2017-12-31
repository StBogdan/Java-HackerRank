package com.company.OOP;

import java.util.Scanner;

public class Java_Interface {
    public static void main(String []args){
        MyCalc my_calculator = new MyCalc();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

class MyCalc implements  AdvancedArithmetic{

    @Override
    public int divisor_sum(int n) {
        int divSum =0;
        for(int i=1;i<=n/2;i++){
            if(n%i == 0)
                divSum+=i;
        }
        divSum+=n;
        return divSum;
    }
}

interface AdvancedArithmetic{
    int divisor_sum(int n);
}