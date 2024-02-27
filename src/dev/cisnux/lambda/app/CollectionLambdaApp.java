package dev.cisnux.lambda.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionLambdaApp {
    public static void main(String[] args) {
        final var names = new ArrayList<>(List.of("Fajra", "Risqulla", "Cisnux", "Fajra Risqulla", "Cisnux Predator"));
        names.forEach(System.out::println);

        names.replaceAll(String::toLowerCase);
        System.out.println();
        names.forEach(System.out::println);

        names.removeIf(s -> s.length() > 5);
        System.out.println();
        names.forEach(System.out::println);

        final var name = new HashMap<String, String>();
        name.put("firstName", "Fajra");
        name.put("middleName", "Cisnux");
        name.put("lastName", "Risqulla");
        name.forEach((o, o2) -> System.out.printf("%s : %s\n", o, o2));
    }
}
