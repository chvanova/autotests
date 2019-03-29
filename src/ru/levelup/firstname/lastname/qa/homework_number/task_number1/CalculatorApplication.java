package ru.levelup.firstname.lastname.qa.homework_number.task_number1;

import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        CalculatorApplication app = new CalculatorApplication();
        app.startApplication();
        double number1 = get_number();
        String operation = get_operation();
        double number2 = get_number();
        String sum = String.valueOf('+');
        String min = String.valueOf('-');
        String mult = String.valueOf('*');
        String div = String.valueOf('/');
        double result;


        if (operation.equals(sum)) {
            result = number1 + number2;
            System.out.print(result);

        }
        if (operation.equals(min)) {
            result = number1 - number2;
            System.out.print(result);

        }
        if (operation.equals(mult)) {
            result = number1 * number2;
            System.out.print(result);

        }
        if (operation.equals(div)) {
            try {
                result = number1 / number2;
                System.out.print(result);

            }
            catch (ArithmeticException e) {
                System.err.println("Mathematical error");

            }

        }
    }

    private static double get_number() {
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        String input_str = scan.next();
        double number = 0;

        try {
            number = Double.valueOf(input_str);

        } catch (NumberFormatException e) {
            System.err.println("Invalid string format");
        }

        return number;
    }

    private static String get_operation(){
        System.out.print("Enter operation: ");
        Scanner scan = new Scanner(System.in);
        String operation = scan.next();
        return operation;
    }


    private void startApplication() {

    }

}
