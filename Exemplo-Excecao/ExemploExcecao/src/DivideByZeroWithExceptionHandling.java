import java.util.InputMismatchException;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class DivideByZeroWithExceptionHandling {

    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continueLoop = true;

        do {
            try {

                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();

                System.out.print("Please enter an integer denominador: ");
                int denominador = scanner.nextInt();

                int result = quotient(numerator, denominador);

                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominador, result);

                continueLoop = false;

            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n", inputMismatchException);
                scanner.nextLine();
                System.out.printf("You must enter integers. Please try again.%n%n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
            }

        } while (continueLoop);

    }
}
