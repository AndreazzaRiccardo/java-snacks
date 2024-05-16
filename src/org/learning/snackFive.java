package org.learning;

import java.util.Scanner;

public class snackFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Insert string (insert '0' for exit): ");
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            int charAlf = 0;
            int numbers = 0;
            int notAlf = 0;

            for (int i = 0; i < input.length(); i++) {
                char  myChar = input.charAt(i);

                if (Character.isLetter(myChar)) {
                    charAlf++;
                } else if (Character.isDigit(myChar)) {
                    numbers++;
                } else {
                    notAlf++;
                }
            }

            System.out.println("Charaters: " + charAlf);
            System.out.println("Numbers " + numbers);
            System.out.println("Symbols: " + notAlf);
        }

        scanner.close();
    }
}
