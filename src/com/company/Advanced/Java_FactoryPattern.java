package com.company.Advanced;

import java.security.Permission;
import java.util.Scanner;

public class Java_FactoryPattern {

        public static void main(String []args){

        DoNotTerminate.forbidExit();

		try{
        Scanner sc=new Scanner(System.in);
        //creating the factory
        FoodFactory foodFactory = new FoodFactory();

        //factory instantiates an object
        Food food = foodFactory.getFood(sc.nextLine());

        System.out.println("The factory returned "+food.getClass());
        System.out.println(food.getType());
        }
		catch (DoNotTerminate.ExitTrappedException e) {
        System.out.println("Unsuccessful Termination!!");
        }
    }
}
interface Food {
    public String getType();
}
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
class FoodFactory {
    public Food getFood(String order) {
        if(order.compareTo("cake")==0) {
            return new Cake();
        }
        else
            return new Pizza();
    }//End of getFood method

}//End of factory class
