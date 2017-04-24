package com.paddypower;

/**
 * This program plays the game "Fizzbuzz".  It counts to 100, replacing each multiple of 3 with the word "fizz",
 * each multiple of 5 with the word "buzz", and each multiple of both with the word "fizzbuzz".  It uses the modulo
 * operator (%) to determine if a number is divisible by another.
 **/
public class FizzBuzz {
    public static void main(String... args) {
        printFizzBuzz(50);
    }

    public static void printFizzBuzz(final int limit) {
        if(limit <= 0){
            throw new IllegalArgumentException("Please enter a number greater than 0");
        }else{
            for(int i = 1; i <= limit; i++){
                if(i % 3 == 0 && i % 5 ==0){                   //15, 30,...
                    System.out.println(i + "FizzBuzz");
                }else if(i % 5 == 0){
                    System.out.println(i + "Buzz");               // 5,10,20,25,35...
                }if(i % 3 == 0) {
                    System.out.println(i + "Fizz");               // 3,6,9,12,18,21,24,27
                }
            }

        }
    }
}
