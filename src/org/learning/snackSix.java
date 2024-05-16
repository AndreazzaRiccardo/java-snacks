package org.learning;

import java.util.Scanner;

public class snackSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Insert numeric string: ");
            String myString = scanner.nextLine();
            boolean isNum = true;

            for (int i = 0; i < myString.length(); i++) {
                if (!Character.isDigit(myString.charAt(i))) {
                    System.out.println("You must only enter numeric characters");
                    isNum = false;
                    break;
                }
            }

            if (isNum) {
                for (int i = 0; i < myString.length(); i++) {
                    System.out.print(Character.getNumericValue(myString.charAt(i)));
                }
                break;
            }
        }

        scanner.close();
    }
}
