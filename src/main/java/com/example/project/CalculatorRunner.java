package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("Sophie's Calculator");

        int n1 = 15;
        int n2 = -4;
        double additionResult = calculator.performOperation("+", n1, n2);
        System.out.println("addition result: " + additionResult);

        double subtractionResult = calculator.performOperation("-", n1, n2);
        System.out.println("subtraction result: " + subtractionResult);

        n1 = 9;
        n2 = -80;
        double multiplicationResult = calculator.performOperation("*", n1, n2);
        System.out.println("multiplication result: " + multiplicationResult);

        n1 = 8;
        n2 = 2;
        double divisionResult = calculator.performOperation("/", n1, n2);
        System.out.println("division result: " + divisionResult);

        boolean isDivisible = calculator.divisibleBy(4, 2);
        System.out.println("is divisible: " + isDivisible);

        String coordinatePair = calculator.coordinatePair(2, 3);
        System.out.println("coordinate pair: " + coordinatePair);

        int absoluteValueResult = calculator.absoluteValue(2, 3);
        System.out.println("absolute value: " + absoluteValueResult);

        String info = calculator.info();
        System.out.println("Calculator Info: " + info);
    }
}