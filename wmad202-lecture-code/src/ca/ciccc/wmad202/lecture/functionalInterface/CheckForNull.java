package ca.ciccc.wmad202.lecture.functionalInterface;

import java.util.function.Predicate;

public class CheckForNull implements Predicate {
    @Override
    public boolean test(Object o) {
        return o != null;
    }
}