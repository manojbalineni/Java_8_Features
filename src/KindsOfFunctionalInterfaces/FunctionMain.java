package KindsOfFunctionalInterfaces;

import java.util.function.Function;

public class FunctionMain {

    public static void main(String[] args) {
        int x = 25;
        Function<Integer,Integer> result = number -> number + x;
        System.out.println(result.apply(10));
    }
}
