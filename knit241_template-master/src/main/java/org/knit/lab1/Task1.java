package org.knit.lab1;

public class Task1 {
    public void execute() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ",");
            if (i % 10 == 0) {
                System.out.print("\n");
            }
        }
    }
}
