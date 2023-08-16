package org.example;

public final class MathUtils {

    private MathUtils(){

    }

    public static String callEndpoint(){

        return "https://medium.com/";
    }


    public static int sum(int num1,int num2){
        return num1 + num2;
    }

    public static String printName(String name){
        return "The printed name is: " + name;
    }
}
