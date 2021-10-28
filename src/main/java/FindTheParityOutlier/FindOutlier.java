package FindTheParityOutlier;

/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
Write a method that takes the array as an argument and returns this "outlier" N.

Examples

[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
 */

public class FindOutlier {

    public static void main(String[] args) {
        int[] arr = {11, 4, 0, 100, 4, 2, 2602, 36};
        System.out.println(find(arr));
    }

    static int find(int[] integers) {
        int N = 0;
        int counter = 0;

        for (int integer : integers) {
            if (integer % 2 == 0) counter++;
        }
        for (int integer : integers) {
            if (counter > 1) {
                if (integer % 2 != 0) N = integer;
            }

            if (counter == 1) {
                if (integer % 2 == 0) N = integer;
            }
        }
        return N;
    }
}
