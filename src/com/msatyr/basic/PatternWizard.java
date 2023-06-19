package com.msatyr.basic;

import java.util.Scanner;

public class PatternWizard {

    public static void printUpwardRightAngledStarPattern(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println();
        }


    }

    public static void printDownwardRightAngledStarPattern(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {

                System.out.print("*");
            }

            System.out.println();
        }


    }

    public static void Enter() {

        System.out.println("1]Print Upward Right Angled Star Pattern");

        System.out.println("2]Print Downward Right Angled Star Pattern");

        var scanner = new Scanner(System.in);

        var input = scanner.next();

        if (input != null && input.trim().length() > 0) {

            switch (input.charAt(0)) {

                case '1' -> {

                    System.out.println("Enter input number:");

                    var number = scanner.nextInt();

                    PatternWizard.printUpwardRightAngledStarPattern(number);

                }

                case '2' -> {

                    System.out.println("Enter input number:");

                    var number = scanner.nextInt();

                    PatternWizard.printDownwardRightAngledStarPattern(number);
                }

                default -> {

                    System.out.println("exiting....");

                    System.exit(0);
                }
            }
        }
    }
}
