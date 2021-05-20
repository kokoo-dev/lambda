package com.kokoo.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {

    public static void executeConstructor(){
        Function<String, Person> function1 = Person::new;
        Person person1 = function1.apply("박지성");
        person1.print();

        BiFunction<String, Integer, Person> function2 = Person::new;
        Person person2 = function2.apply("히딩크", 74);
        person2.print();
    }

    public static void executeInstanceMethod(){
        List<Person> personList = Arrays.asList(new Person("김린이", 10), new Person("김성인", 30), new Person("김노인", 80));

        personList.stream().forEach(Person::print);
    }

    public static void executeStaticMethod(){
        String str = "";
        Printer printer = ExampleMethod::printClass;
        printer.printArgStr(str);
    }


}
