import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        boolean answer = true;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
            }
            else if(stack.empty()){
                answer = false;
            }
            else{
                stack.pop();
            }
        }
        if (!stack.empty()){
            answer = false;
        }
        return answer;
    }
}
