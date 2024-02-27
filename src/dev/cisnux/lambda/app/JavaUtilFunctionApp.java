package dev.cisnux.lambda.app;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaUtilFunctionApp {
    public static void main(String[] args) {
        final Consumer<String> consumer = value -> System.out.println(value);
        consumer.accept("Fajra Risqulla");

        final Function<String, Integer> function = value -> value.length();
        System.out.println(function.apply("Fajra Risqulla"));

        final Predicate<String> predicate = value -> value.isBlank();
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("hello"));

        final Supplier<String> supplier = () -> "Hello World! 💪";
        System.out.println(supplier.get());
    }
}
