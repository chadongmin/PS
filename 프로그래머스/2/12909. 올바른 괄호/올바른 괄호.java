import java.util.*;
class Solution {
    boolean solution(String s) {
     
        Stack<Character> stack = new Stack<>();

        char[] charArray = s.toCharArray();

        for (var c : charArray) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (c == ')') {
                    if (stack.isEmpty()){
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return true;
        }

        return false;
    
    }
}