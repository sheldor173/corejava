package com.msatyr.basic;

import java.util.Random;
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
}
