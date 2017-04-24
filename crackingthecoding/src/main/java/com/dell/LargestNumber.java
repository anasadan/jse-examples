package com.dell;

public class LargestNumber {
        public static void main(String... args) {
                int a[] = { 3, 0, -1, 99, 102, 2, 9 };
                int b[] = { 3, 0, -1, 99, 102, 2, 9 };
                int c[] = { 3, 0, -1, 99, 102, 2, 9 };
                int largeA = largestNumber(a);
                int largeB = largestNumber(b);
                int largeC = largestNumber(c);
                System.out.println(
                        "Largest no from array A : " + largeA + " from array B : " + largeB + " and from array C : "
                                + largeC);
        }

        public static int largestNumber(final int array[]) {
                if (array == null || array.length == 0) {
                        throw new IllegalArgumentException("Array cannot be null or empty");
                }

                int largest = Integer.MIN_VALUE;
                for (int no : array) {
                        if (no > largest) {
                                largest = no;
                        }
                }
                return largest;
        }
}