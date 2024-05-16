package org.learning;

import java.util.Random;

public class snackTwo {
    public static void main(String[] args) {
        String[] names = {"Mario", "Paolo", "Alessandro", "Giuseppe"};
        String[] surnames = {"Rossi", "Verdi", "Bianchi", "Neri"};

        Random rand = new Random();

        boolean[][] comb = new boolean[names.length][surnames.length];

        for (int i = 0; i < 4; i++) {
            int nameIndex;
            int surnameIndex;

            do {
                nameIndex = rand.nextInt(names.length);
                surnameIndex = rand.nextInt(surnames.length);
            } while (comb[nameIndex][surnameIndex]);

            System.out.println(names[nameIndex] + " " + surnames[surnameIndex]);

            comb[nameIndex][surnameIndex] = true;
        }
    }
}
