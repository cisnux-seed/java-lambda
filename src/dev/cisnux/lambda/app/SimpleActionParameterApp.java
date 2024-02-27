package dev.cisnux.lambda.app;

import dev.cisnux.lambda.SimpleAction;
import dev.cisnux.lambda.SimpleActionParameter;

public class SimpleActionParameterApp {
    public static void main(String[] args) {
        final SimpleActionParameter simpleAction = (String name) -> {
            return String.format("Hi %s", name);
        };
        final SimpleActionParameter simpleAction1 = (String name) -> String.format("Hi %s", name);
        final SimpleActionParameter simpleAction2 = name -> String.format("Hi %s", name);

        System.out.println(simpleAction.greeting("Fajra"));
        System.out.println(simpleAction1.greeting("Cisnux"));
        System.out.println(simpleAction2.greeting("Risqulla"));
        System.out.println(((SimpleActionParameter) name -> String.format("Hi %s", name)).greeting("Fajra Risqulla"));
    }
}
