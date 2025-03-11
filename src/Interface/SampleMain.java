package Interface;

import Interface.impl.SampleImpl;

public class SampleMain {

    public static void main(String[] args) {


       //Sample  = interface
        //SampleImpl  = implementations
        //Interface objectName = new InterfaceImplementationClass();
        Sample sample = new SampleImpl();
        int result = sample.addition(20,30);
        System.out.println("Result : " + result);

        String hello = sample.sayHello("Manoj");
        System.out.println("Result : " + hello);

        System.out.println(sample.sayHi());

        System.out.println(sample.multiply(10,20));





    }
}
