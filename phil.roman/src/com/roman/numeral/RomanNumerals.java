package com.roman.numeral;

public class RomanNumerals {
    static String[] LETTERS = new String[] {
            "IIIIIIIVVVIVIIVIIIIX", "XXXXXXXLLLXLXXLXXXXC",
            "CCCCCCCDDDCDCCDCCCCM",	"MMMMMM" };
    static int[] OFFSETS = new int[] { 0, 0, 1, 3, 6, 8, 9, 11, 14, 18, 20 };
    public static void main(String[] args) {
        for(int i = 0; i < args[0].length(); i++) {
            int digit = args[0].charAt(i) - '0';
            System.out.print(LETTERS[args[0].length()-i-1].substring(OFFSETS[digit], OFFSETS[digit+1]));
        }
    }
}
