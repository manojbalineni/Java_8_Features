package KindsOfFunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
    }
}
