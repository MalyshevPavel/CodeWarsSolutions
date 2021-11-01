package YourOrderPlease;

/*
Your task is to sort a given string. Each word in the string will contain a single number.
This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples

"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
*/

public class Order {

    public static void main(String[] args) {
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
    }

    public static String order(String words) {

        if (words.isEmpty()) return "";
        String result = "";
        String[] splitWords = words.split(" ");

        for (int i = 1; i < 10; i++) {
            for (String s : splitWords) {
                if (s.contains(String.valueOf(i))) result += s + " ";
            }
        }
        result = result.trim();
        return result;
    }
}
