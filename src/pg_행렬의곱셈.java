public class pg_행렬의곱셈 {
    class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int n = arr1.length;
        int m = arr1[0].length;
        int l = arr2[0].length;
        int[][] answer = new int[n][l];
        
        for (int i = 0; i < n; i++) {   // arr1의 행
            for (int j = 0; j < l; j++) {   // arr2의 열
                for (int k = 0; k < m; k++) {   // arr1의 열 == arr2의 행
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}
}
