import java.util.Stack;

public class pg_괄호회전 {
class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            String str = s.substring(i) + s.substring(0, i);//회전생각
            if (isVal(str)) {
                answer++;
            }
        }

        return answer;
    }
    
    public boolean isVal(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')//닫혀있을경우랑 분리
            {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                
                if ((c == ')' && stack.pop() != '(') ||
                    (c == ']' && stack.pop() != '[') ||
                    (c == '}' && stack.pop() != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
}
