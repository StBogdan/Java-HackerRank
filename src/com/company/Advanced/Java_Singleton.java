package com.company.Advanced;

public class Java_Singleton {
    public String str;
    public volatile static Java_Singleton instance;
    private Java_Singleton(){
    }

    public static Java_Singleton getSingleInstance(){
        if(instance == null){
            instance = new Java_Singleton();
        }
        return instance;
    }
}
