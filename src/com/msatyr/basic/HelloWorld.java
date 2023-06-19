package com.msatyr.basic;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

        var scanner = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("Enter your input:");

                System.out.println("1]Print Fibonacci");

                System.out.println("2]Check Prime");

                System.out.println("3]Check Palindrome");

                System.out.println("4]Print Factorial");

                System.out.println("5]Check Armstrong");

                System.out.println("6]Print Random Numbers");

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

                        case '2':

                            System.out.println("input number:");

                            var number = scanner.nextInt();

                            NumberMage.testPrime(number);

                            break;

                        case '3':

                            System.out.println("input number:");

                            number = scanner.nextInt();

                            NumberMage.testPalindrome(number);

                            break;

                        case '4':

                            System.out.println("input number:");

                            number = scanner.nextInt();

                            System.out.println(NumberMage.printFactorial(number));

                            break;

                        case '5':

                            System.out.println("input number:");

                            number = scanner.nextInt();

                            System.out.println(NumberMage.testArmstrong(number));

                            break;

                        case '6':

                            NumberMage.printRandomType1();

                            NumberMage.printRandomType2();

                            NumberMage.printRandomType3();

                            NumberMage.printRandomType4();

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
