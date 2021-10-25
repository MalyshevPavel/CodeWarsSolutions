package SquareEveryDigit;

import java.util.ArrayList;
import java.util.Collections;

/*
    Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

    For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

    Note: The function accepts an integer and returns an integer
 */

public class SquareDigit {
    public static void main(String[] args) {

        System.out.println(squareDigits(9119));
    }

    public static int squareDigits(int n) {
        if (n == 0) return 0;
        ArrayList<Integer> digits = new ArrayList();
        while (n > 0) {
            int digit = n % 10;
            int squaredDigit = digit * digit;
            digits.add(squaredDigit);
            n /= 10;
        }
        Collections.reverse(digits);
        String result = "";
        for (int e : digits) {
            result = result.concat(String.valueOf(e));
        }
        return Integer.parseInt(result);
    }

}


