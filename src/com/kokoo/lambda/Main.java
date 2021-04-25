package com.kokoo.lambda;

import com.kokoo.lambda.example.Calculator;
import com.kokoo.lambda.example.Printer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //기본식 : (매개변수) -> 실행문

        Printer p = (String s) -> System.out.println(s);
        p.printArgStr("print!!");

        Calculator c = (int a, int b, int oper) -> oper == 0 ? a + b : a - b;
        System.out.println(c.calc(10, 15, 0));

        //메소드 레퍼런스
        Calculator c2 = (int a, int b, int oper) ->{
            int result = 0;
            if(oper == 0)
                result = a + b;
            else if(oper == 1)
                result = a - b;
            else if(oper == 2)
                result = a * b;
            else if(oper == 3)
                result = a / b;

            return result;
        };

        System.out.println(c2.calc(11, 10, 3));

        List<Integer> list = new ArrayList<>();
        list.add(77);
        list.add(100);
        list.add(20);
        list.sort((o1, o2) -> o1 - o2);

        for(Integer i : list)
            System.out.println(i);

    }
}
