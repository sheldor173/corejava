package com.msatyr.basic;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

        var scanner = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("Enter your input:");

                System.out.println("1]Play with Number Mage");

                System.out.println("2]Play with Pattern Wizard");

                System.out.println("press any other key to exit...");

                var input = scanner.next();

                switch (input.charAt(0)) {

                    case '1':

                        NumberMage.Enter();

                        break;

                    case '2':

                        PatternWizard.Enter();

                        break;
                    default:
                        System.out.println("exiting...");
                        return;
                }

            } catch (Exception e) {

                System.out.println("invalid input, reason: " + e.getMessage());

            }

        }
    }


}
