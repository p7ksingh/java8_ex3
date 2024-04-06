package com.java8;

import java.util.stream.Stream;

public class IterateEx {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 1)
                .filter(dt -> dt <= 30)
                .limit(100)
                .forEach(e -> System.out.println(e));
    }
}
