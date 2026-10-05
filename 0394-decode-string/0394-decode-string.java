import java.util.*;

class Solution {
    public String decodeString(String s) {

        Stack<Integer> numbers = new Stack<>();
        Stack<String> words = new Stack<>();

        String current = "";
        int number = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }

            else if (ch == '[') {
                numbers.push(number);
                words.push(current);

                number = 0;
                current = "";
            }

            else if (ch == ']') {
                int count = numbers.pop();
                String previous = words.pop();

                String temp = "";

                for (int j = 0; j < count; j++) {
                    temp = temp + current;
                }

                current = previous + temp;
            }

            else {
                current = current + ch;
            }
        }

        return current;
    }
}