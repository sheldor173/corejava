package com.msatyr.basic;

public class NumberMage {

    /*
     *
     *   prints the fibonacci series between two numbers
     * */

    public static void printFibonacci(int start, int end) {

        var i = 0;

        var j = 1;

        var valid = true;

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
}
