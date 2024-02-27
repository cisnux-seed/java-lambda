package dev.cisnux.lambda.app;

import java.util.function.Supplier;

public class LazyParameterApp {
    public static void main(String[] args) {
        // non-lazy parameter
        testScore(81, heavyString());
        // heavyString will be called earlier
        System.out.println();
        testScore(70, heavyString());
        System.out.println();

        // lazy parameter
        testScore(81, LazyParameterApp::heavyString);
        // heavyString will be called lazily
        System.out.println();
        testScore(70, LazyParameterApp::heavyString);
    }

    // lazy parameter
    public static void testScore(int value, Supplier<String> name) {
        if (value > 80)
            System.out.printf("Congratulations %s, you passed the exam\n", name.get());
        else
            System.out.println("Don't quit, let's try again");
    }

    // non-lazy parameter
    public static void testScore(int value, String name) {
        if (value > 80)
            System.out.printf("Congratulations %s, you passed the exam\n", name);
        else
            System.out.println("Don't quit, let's try again");
    }

    public static String heavyString() {
        System.out.println("request data");
        return "Cisnux";
    }
}
