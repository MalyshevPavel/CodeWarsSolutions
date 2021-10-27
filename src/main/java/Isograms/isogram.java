package Isograms;

/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter casing)
 */

public class isogram {

    public static void main(String[] args) {
        System.out.println(isIsogram("moOse"));
    }

    public static boolean isIsogram(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.toLowerCase().charAt(j)) counter++;
                if (counter > 1) return false;
            }
            counter = 0;
        }
        return true;
    }
}
