package com.kokoo.lambda;

import com.kokoo.lambda.example.Lambda;
import com.kokoo.lambda.example.StreamExample;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lambda Run");
        Lambda.run();

        System.out.println("Stream Run");
        StreamExample.run();
    }
}
