package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IdentityEx {
    public static void main(String[] args) {
        Function<String, String> identity = Function.identity();
        String ex = identity.apply("Hello");
        System.out.println(ex);

        List<String> wordList = Arrays.asList("Pankaj", "Dhiraj", "Niraj", "Niraj", "Alam", "Dhiraj");
        Map<String, Long> collect = wordList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
