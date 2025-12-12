class Solution {
    public int solution(int num, int n) {
        // 삼항연산
        int answer = (num % n == 0) ? 1 : 0;
        return answer;
    }
}