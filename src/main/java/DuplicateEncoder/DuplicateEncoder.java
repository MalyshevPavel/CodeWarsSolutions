package DuplicateEncoder;

/*
The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string,
or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples

"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("

Notes
Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
 */

public class DuplicateEncoder {

    public static void main(String[] args) {
        System.out.println(encode("   ()(   "));
    }

    static String encode(String word) {
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.toLowerCase().charAt(i);

            for (int j = 0; j < word.length(); j++) {
                if (word.toLowerCase().charAt(j) == ch) counter++;
            }
            if (counter > 1) stringBuilder.append(')');
            else stringBuilder.append('(');
            counter = 0;
        }
        word = stringBuilder.toString();
        return word;
    }
}
