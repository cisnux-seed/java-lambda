package dev.cisnux.lambda;

@FunctionalInterface
public interface SimpleActionParameter {
    String greeting(String name);
}
