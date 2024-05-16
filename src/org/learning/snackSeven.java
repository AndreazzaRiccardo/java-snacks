package org.learning;

import java.util.Scanner;

public class snackSeven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert total seconds: ");
        int sec = scanner.nextInt();

        int hours = sec / 3600;
        int overHours = sec % 3600;
        int min = overHours / 60;
        int overSec = overHours % 60;

        String time = String.format("%02d:%02d:%02d", hours, min, overSec);
        System.out.println("Total time: " + time);

        scanner.close();
    }
}
