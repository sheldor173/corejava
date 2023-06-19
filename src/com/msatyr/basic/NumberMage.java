package com.msatyr.basic;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberMage {

    /*
     *
     *   prints the fibonacci series between two numbers
     * */

    public static void printFibonacci(int start, int end) {

        var i = 0;

        var j = 1;

        while (true) {

            i = i + j;

            j = i - j;

            if (i >= start && i <= end) {

                System.out.println(i);

            } else if (i >= end) {

                break;
            }

        }

    }

    /*
     *
     *   tests prime number
     *
     */
    public static void testPrime(int number) {

        if (number < 2) {

            System.out.println(number + "is not prime");

        } else {

            for (int i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0) {

                    System.out.println(number + " is not prime");

                    return;
                }
            }


            System.out.println(number + " is prime");

        }


    }


    /*
     *
     *   tests palindrome number
     *
     */

    public static void testPalindrome(int number) {

        int reversedNumber = 0;

        var copyNumber = number;

        while (copyNumber > 0) {

            var remainder = copyNumber % 10;

            reversedNumber = reversedNumber * 10 + remainder;

            copyNumber /= 10;
        }

        if (reversedNumber == number) {

            System.out.println("number: " + number + " is palindrome number");

        } else {

            System.out.println("number: " + number + " is not a palindrome number");

        }


    }

    /*
     *
     * prints factorial using recursion
     * */

    public static int printFactorial(int number) {

        if (number <= 1) {

            return 1;
        }

        return number * printFactorial(number - 1);
    }

    public static boolean testArmstrong(int number) {

        var copyNumber = number;

        var length = String.valueOf(copyNumber).length();

        var sum = 0;

        while (copyNumber > 0) {

            var remainder = copyNumber % 10;

            sum += Math.pow(remainder, length);

            copyNumber = copyNumber / 10;

        }

        return sum == number;
    }

    public static void printRandomType1() {

        System.out.println(Math.round(Math.random() * 100) / 100);

    }

    public static void printRandomType2() {

        System.out.println(new Random().nextFloat());
    }

    public static void printRandomType3() {

        System.out.println(ThreadLocalRandom.current().nextDouble());
    }

    public static void printRandomType4() {

        new Random().ints(1).forEach(System.out::println);
    }

    public static void Enter() {

        System.out.println("1]Print Fibonacci");

        System.out.println("2]Check Prime");

        System.out.println("3]Check Palindrome");

        System.out.println("4]Print Factorial");

        System.out.println("5]Check Armstrong");

        System.out.println("6]Print Random Numbers");

        System.out.println("press any other key to exit");

        var scanner = new Scanner(System.in);

        var input = scanner.next();

        if (input != null && input.trim().length() > 0) {

            switch (input.charAt(0)) {

                case '1' -> {

                    System.out.println("input start:");

                    var start = scanner.nextInt();

                    System.out.println("input end:");

                    var end = scanner.nextInt();

                    NumberMage.printFibonacci(start, end);

                }

                case '2' -> {

                    System.out.println("input number:");

                    var number = scanner.nextInt();

                    NumberMage.testPrime(number);
                }

                case '3' -> {

                    System.out.println("input number:");

                    var number = scanner.nextInt();

                    NumberMage.testPalindrome(number);

                }

                case '4' -> {

                    System.out.println("input number:");

                    var number = scanner.nextInt();

                    System.out.println(NumberMage.printFactorial(number));

                }

                case '5' -> {

                    System.out.println("input number:");

                    var number = scanner.nextInt();

                    System.out.println(NumberMage.testArmstrong(number));

                }

                case '6' -> {

                    NumberMage.printRandomType1();

                    NumberMage.printRandomType2();

                    NumberMage.printRandomType3();

                    NumberMage.printRandomType4();

                }

                default -> {

                    System.out.println("exiting...!!");

                    System.exit(0);
                }

            }

        }
    }
}
