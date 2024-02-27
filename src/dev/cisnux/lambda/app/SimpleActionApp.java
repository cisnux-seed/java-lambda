package dev.cisnux.lambda.app;

import dev.cisnux.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        final SimpleAction simpleAction = () -> {
            return "Cisnux";
        };
        final SimpleAction simpleAction1 = () -> "Fajra";
        System.out.println(simpleAction.action());
        System.out.println(simpleAction1.action());
        System.out.println(((SimpleAction) () -> "Fajra Risqulla").action());
    }
}
