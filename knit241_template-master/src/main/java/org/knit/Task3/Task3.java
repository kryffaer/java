package org.knit.Task3;

import java.util.Scanner;

public class Task3 {
    public void execute() {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите первое число: ");
            String aa = scanner.next();
            if (aa.equals("exit")) {
                break;
            }
            double a = Double.parseDouble(aa);
            System.out.print("Введите оператор (+, -, *, /): ");
            String op = scanner.next();
            if (op.equals("exit")) {
                break;
            }
            System.out.print("Введите второе число: ");
            String bb = scanner.next();
            if (bb.equals("exit")) {
                break;
            }
            double b = Double.parseDouble(bb);

            switch (op) {
                case ("+"): {
                    System.out.println(calculator.add(a, b));
                    break;
                }
                case ("-"): {
                    System.out.println(calculator.subtract(a, b));
                    break;
                }
                case ("*"): {
                    System.out.println(calculator.multiply(a, b));
                    break;
                }
                case ("/"): {
                    if (b == 0) {
                        System.out.println("Ошибка!");
                        break;
                    }
                    System.out.println(calculator.divide(a, b));
                    break;
                }
            }
        }
    }
}