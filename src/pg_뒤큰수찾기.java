import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        // 역으로 순회
        for (int i = n - 1; i >= 0; i--) {
            // 자기보다 작거나 같은 수 삭제
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }
            // 비었으면 -1, 아닐시 스택 top이 바로 뒤에 있는 큰 수
            answer[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(numbers[i]);
        }

        return answer;
    }
}
