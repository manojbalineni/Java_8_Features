package KindsOfFunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerMain {

    public static void main(String[] args) {
        Consumer<String> display =  a -> System.out.println(a);
        display.accept("Hello World");


    }
}
