package FunctionalInerface.interfaces;

public class FunctionalInterfaceMain {

    public static void main(String[] args) {

        //Lambda Expressions are used to implement functional interfaces
        SampleFunctionalInterface sampleFunctionalInterface = (int x , int y) -> {
            System.out.println("In Functional Interface");
            return x/y;
        };
        System.out.println(sampleFunctionalInterface.performDivision(100,20));
        System.out.println(sampleFunctionalInterface.sayGoodNight());
    }
}
