class Solution {
    public int[] solution(int n, long left, long right) {
        int s = (int)(right - left + 1);
        int[] answer = new int[s];
        
        for (int i = 0; i < s; i++) {
            long idx = left + i;
            int row = (int)(idx / n);
            int col = (int)(idx % n);
            answer[i] = Math.max(row, col) + 1;
        }
        
        return answer;
    }
}
