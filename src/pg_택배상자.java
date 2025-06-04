import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int box = 1; 
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < order.length;) {
            if (box == order[i]) {
                answer++;
                box++;
                i++;
            } else if (!stack.isEmpty() && stack.peek() == order[i]) {
                stack.pop();
                answer++;
                i++;
            } else if (box <= order.length) {
                stack.push(box++);
            } else {
                break;
            }
        }

        return answer;
    }
}