package dev.cisnux.lambda.app;

import dev.cisnux.lambda.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        // static
        Predicate<String> predicate = StringUtil::isLowerCase;
        System.out.println(predicate.test("Fajra"));
        System.out.println(predicate.test("fajra"));
        System.out.println();

        // non static
        final var app = new MethodReferenceApp();
        app.run();

        System.out.println();
        Predicate<String> predicate1 = app::isLowerCase;
        System.out.println(predicate1.test("Fajra"));
        System.out.println(predicate1.test("fajra"));

        Function<String, String> function = String::toUpperCase;
        System.out.println();
        System.out.println(function.apply("fajra"));
        System.out.println(function.apply("fajra risqulla"));
    }


    public void run(){
        Predicate<String> predicate = this::isLowerCase;
        System.out.println(predicate.test("Fajra"));
        System.out.println(predicate.test("fajra"));
    }

    public boolean isLowerCase(String value) {
        for (final var c : value.toCharArray()) {
            if (Character.isUpperCase(c))
                return false;
        }
        return true;
    }
}
