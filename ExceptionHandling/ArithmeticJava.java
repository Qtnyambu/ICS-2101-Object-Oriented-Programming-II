package ExceptionHandling;

import java.io.*;

public class ArithmeticJava {
    public static void main(String[] args)
    {
        int number1 = 300;
        int number2 = 0;
        try {
            int answer = number1 / number2;
            System.out.println("The answer is: " + answer);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
            System.out.println("Program continues after handling the excetion.");
        }
    }
}