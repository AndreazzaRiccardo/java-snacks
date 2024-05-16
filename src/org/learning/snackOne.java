package org.learning;

import java.util.Scanner;

public class snackOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert one number: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n % 2 == 0) {
                System.out.println(n);
            } else {
                System.out.println(n + 1);
            }
        } else {
            System.out.println("You must enter an integer");
        }

        scanner.close();
    }
}
