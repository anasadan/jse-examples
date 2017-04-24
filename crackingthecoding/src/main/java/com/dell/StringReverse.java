package com.dell;

class StringReverse {
        public static void main(String... args) {
                System.out.println(strReverse("DELL"));
        }

        public static String strReverse(final String string) {
                if (string == null || string.isEmpty()) {
                        throw new IllegalArgumentException("string is null or empty");
                } else {
                        final StringBuilder stringReverse = new StringBuilder();
                        for (int i = string.length() - 1; i >= 0; i--) {
                                stringReverse.append(string.charAt(i));
                        }
                        return stringReverse.toString();
                }

        }
}