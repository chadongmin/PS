import java.util.*;
class Solution {
       public static int solution(String s) {

        boolean isValid;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            isValid = true;
            String str = s.substring(i) + s.substring(0, i);
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                String val = str.substring(j, j + 1);
                if ((val.equals("(") || val.equals("[") || val.equals("{"))) {
                    stack.push(val);
                } else {
                    if (stack.isEmpty()) {
                        isValid = false;
                    } else {
                        String top = stack.peek();
                        if (val.equals(")") && top.equals("(") ||
                                val.equals("}") && top.equals("{") ||
                                val.equals("]") && top.equals("[")) {
                            stack.pop();
                        } else {
                            isValid = false;
                            break;
                        }
                    }
                }
            }
            if (isValid && stack.isEmpty()) {
                answer++;
            }
        }
        return answer;

    }
}