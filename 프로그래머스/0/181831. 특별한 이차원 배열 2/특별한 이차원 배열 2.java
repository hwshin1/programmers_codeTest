class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // arr[i][j]와 arr[j][i]가 다르면 0 반환
                if (arr[i][j] != arr[j][i]) {
                    return answer;
                }
            }
        }
        
        answer = 1;
        
        return answer;
    }
}