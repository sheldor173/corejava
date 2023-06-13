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

            }else if (i >= end) {

                break;
            }

        }

    }

}
