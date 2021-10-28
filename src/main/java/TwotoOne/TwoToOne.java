package TwotoOne;

/*
Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible,
containing distinct letters - each taken only once - coming from s1 or s2.

Examples:

a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */

public class TwoToOne {

    public static void main(String[] args) {
        System.out.println(longest("inmanylanguages", "theresapairoffunctions"));
    }

    public static String longest(String s1, String s2) {
        return s1.concat(s2)
                .codePoints()
                .distinct()
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
