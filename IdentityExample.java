package com.java8;

import java.util.function.Function;

public class IdentityExample {

    public static void main(String[] args) {
        // Create a Function that returns the input itself
        Function<String, String> identityFunction = Function.identity();

        // Use the identity function
        String result = identityFunction.apply("Hello, World!");

        System.out.println(result); // Output: Hello, World!
    }
}
