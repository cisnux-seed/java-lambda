package dev.cisnux.lambda;

public class StringUtil {
    public static boolean isLowerCase(String value) {
        for (final var c : value.toCharArray()) {
            if (Character.isUpperCase(c))
                return false;
        }
        return true;
    }
}
