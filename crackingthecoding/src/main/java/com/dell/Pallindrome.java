package com.dell;

/**
 * Created by ehimnay on 01/03/2017.
 */
//Pallindrome of a number
class Pallindrome {

        public static void main(String... args) {
                System.out.println("is 123 a pallindrome? : " + isPallindrome(123));
                System.out.println("is 121 a pallindrome? : " + isPallindrome(121));
        }

        public static boolean isPallindrome(int number) {
                if (number < 0) {
                        throw new IllegalArgumentException("pallindrome number cannot be negative");
                } else if (number < 10) {
                        return true;
                } else {
                        final int actual = number;
                        int reverse = 0;
                        while (number > 0) {
                                reverse = reverse * 10 + number % 10;
                                number = number / 10;
                        }
                        return actual == reverse;
                }
        }

}
