package Strings;

public class Strings {
    public static void main(String[] args) {
        //1. Using String Class
        // Immutable
        String firstName = "Manoj";
        firstName += " Babu";
        System.out.println(firstName);



        //2. Using String Buffer
        //Mutable
        //Thread Safe and Synchronized

        StringBuffer stringBuffer = new StringBuffer("Swapna");
        stringBuffer.append(" Siliguri");
        System.out.println(stringBuffer);


        //3. Using String Builder
        //Mutable
        //Not a thread safe and not synchronized

        StringBuilder stringBuilder = new StringBuilder("Vissu");
        stringBuilder.append(" Challa");
        System.out.println(stringBuilder);



    }
}
