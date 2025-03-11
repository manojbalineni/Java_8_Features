package Interface.impl;

import Interface.Sample;

public class SampleImpl implements Sample {

    @Override
    public int addition(int x, int y) {
        return x + y;
    }

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
