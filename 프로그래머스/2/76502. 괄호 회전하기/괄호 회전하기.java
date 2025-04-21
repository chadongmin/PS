import java.util.*;
class Solution {
       public static int solution(String s) {
int answer = 0;

        A:
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            String val = s.substring(i) + s.substring(0, i);

            for (int j = 0; j < val.length(); j++) {
                char c = val.charAt(j);
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        continue A;
                    }
                    Character peek = stack.peek();
                    if ((c == ')' && peek == '(') ||
                            (c == ']' && peek == '[') ||
                            (c == '}' && peek == '{')) {
                        stack.pop();
                    } else {
                        continue A;
                    }
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
       }
}