package Exceptions;

public class App {

    public static void main(String[] args) {
        

        try {
            int a = 123;
            int b = 0;
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }


}
