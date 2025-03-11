package Interface;

public interface Sample {

    public int addition(int x, int y);  //abstract methods
    public String sayHello(String name);


    //default methods
    default String sayHi(){
        return "Hello from default Method";
    }

    default int multiply(int x , int y){
        return x *y;
    }


}



