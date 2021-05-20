package com.kokoo.lambda.example;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExample {
    List<String> list;

    public StreamExample(){
        list = new ArrayList<>();
        list.add("cccc");
        list.add("ddddd");
        list.add("eee");
        list.add("aa");
        list.add("bb");
        list.add("cccc");
    }
    /**
     * Stream 재사용 불가능
     * parallellStream() 병렬 스트림으로 여러 쓰레드 작업
     */


    public void executeForEach(){
        System.out.println("-- forEach --");
        list.stream().forEach(s -> System.out.println(s));
    }

    public void executeCount(){
        System.out.println("-- count --");
        System.out.println(list.stream().count());
    }

    public void executeSorted(){
        System.out.println("-- sorted Length --");
        list.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(s -> System.out.println(s));

        System.out.println("-- sorted String --");
        list.stream().sorted((s1, s2) -> s1.compareTo(s2)).forEach(s -> System.out.println(s));
    }

    public void executeDistinct(){
        System.out.println("-- Distinct --");
        list.stream().distinct().forEach(s -> System.out.println(s));
    }

    public void executeFilter(){
        System.out.println("-- Filter --");
        list.stream().filter(s -> s.indexOf("c") > -1).forEach(s -> System.out.println(s));
    }

    public void executeMap(){
        System.out.println("-- Map --");
        list.stream().map(s -> s.concat("_concat")).forEach(s -> System.out.println(s));
    }

    public void executeMatch(){
        //noneMatch, anyMatch, allMatch
        System.out.println("-- Match --");
        System.out.println(list.stream().noneMatch(s -> s.startsWith("z")));
    }

}
