package com.dell;

class FizzBuzz {

        public static void printFizzBuzz(final int limit) {
                if (limit <= 0) {
                        throw new IllegalArgumentException("Please enter a number greater than 0");
                } else {
                        for (int i = 1; i <= limit; i++) {
                                if (i % 3 == 0 && i % 5 == 0) {                   //15, 30,...
                                        System.out.println("FizzBuzz");
                                } else if (i % 5 == 0) {
                                        System.out.println("Buzz");               // 5,10,20,25,35...
                                }
                                if (i % 3 == 0) {
                                        System.out.println("Fizz");               // 3,6,9,12,18,21,24,27
                                }
                        }

                }
        }
}
