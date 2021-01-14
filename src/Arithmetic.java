import java.util.Scanner;

// Exercise 2.15 : Arithmetic.java
// Write an application that asks the user to enter two integers, obtains them
// from the user and prints their sum, product, difference and quotient (division). Use the techniques
// shown in Fig. 2.7.

public class Arithmetic {
    public static void main(String[] args) {

        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);

        int number1; // first number to calculate
        int number2; // second number to calculate
        int sum;
        int sub;
        int mul;
        int div;

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.println("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user
        input.close(); // close input

        sum = number1 + number2;
        sub = number1 - number2;
        mul = number1 * number2;
        div = number1 / number2;

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Difference is %d%n", sub);
        System.out.printf("Product  is %d%n", mul);
        System.out.printf("Quotient is %d%n", div);
    }

}
