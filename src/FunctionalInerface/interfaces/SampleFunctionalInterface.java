package FunctionalInerface.interfaces;

@FunctionalInterface
public interface SampleFunctionalInterface {

    //Interface that contains only single abstract methods and any number of default methods

    public int performDivision(int x , int y);

    default  String sayGoodNight(){
        return "Good Night";
    }

}


