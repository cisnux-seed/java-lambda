package dev.cisnux.lambda.app;

import java.util.Optional;

public class OptionalNullableApp {
    public static void main(String[] args) {
        greetingWithoutOptional("fajra risqulla");
        // throw null pointer exception
//        greetingWithoutOptional(null);
        greetingWithOptional(null);
        greetingWithoutOptional("fajra risqulla");
    }

    public static void greetingWithoutOptional(String name) {
        System.out.println(name.toUpperCase());
    }

    public static void greetingWithOptional(String name) {
        System.out.printf("Hi %s!\n", Optional.ofNullable(name).map(String::toUpperCase).orElseGet(() -> ""));
    }
}
