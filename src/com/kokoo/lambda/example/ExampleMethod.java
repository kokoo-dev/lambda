package com.kokoo.lambda.example;

public class ExampleMethod {
    public static void printClass(Object object){
        Class cls = object.getClass();
        System.out.println(cls.getName());
    }
}
