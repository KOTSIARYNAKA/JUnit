package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Введите операцию (add, subtract, multiply, divide) и два числа:");

        String operation = scanner.next();
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        try {
            switch (operation.toLowerCase()) {
                case "add":
                    System.out.println("Результат: " + calculator.add(num1, num2));
                    break;
                case "subtract":
                    System.out.println("Результат: " + calculator.subtract(num1, num2));
                    break;
                case "multiply":
                    System.out.println("Результат: " + calculator.multiply(num1, num2));
                    break;
                case "divide":
                    System.out.println("Результат: " + calculator.divide(num1, num2));
                    break;
                default:
                    System.out.println("Неизвестная операция.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}