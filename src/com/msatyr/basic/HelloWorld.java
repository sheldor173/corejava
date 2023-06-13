package com.msatyr.basic;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

        var scanner = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("Enter your input:");

                System.out.println("1]Fibonacci");

                System.out.println("press any other key to exit");

                var input = scanner.next();

                if (input != null && input.trim().length() > 0) {

                    switch (input.charAt(0)) {

                        case '1':

                            System.out.println("input start:");

                            var start = scanner.nextInt();

                            System.out.println("input end:");

                            var end = scanner.nextInt();

                            NumberMage.printFibonacci(start, end);


                            break;

                        default:

                            System.out.println("exiting...!!");

                            System.exit(0);
                    }

                }

            } catch (Exception e) {

                System.out.println("invalid input, reason: " + e.getMessage());

            }

        }
    }


}
