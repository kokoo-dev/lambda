package com.kokoo.lambda.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {

    public static void run(){
        //기본식 : (매개변수) -> 실행문

        Printer p = (Object object) -> System.out.println((String)object);
        p.printArgStr("print!!");

        Calculator c = (int a, int b, int oper) -> oper == 0 ? a + b : a - b;
        System.out.println(c.calc(10, 15, 0));

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

        Function<String, Person> function1 = name -> new Person(name);
        Person person1 = function1.apply("홍길동");
        System.out.println("name :: " + person1.getName());

        BiFunction<String, Integer, Person> function2 = (name, age) -> new Person(name, age);
        Person person2 = function2.apply("김길동", 26);

        System.out.println("name :: " + person2.getName() + " age :: " + person2.getAge());
    }

}
