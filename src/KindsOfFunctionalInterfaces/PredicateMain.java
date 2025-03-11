package KindsOfFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args) {
        Predicate<Integer> condition = number -> number == 10;
        System.out.println(condition.test(11));
    }
}
