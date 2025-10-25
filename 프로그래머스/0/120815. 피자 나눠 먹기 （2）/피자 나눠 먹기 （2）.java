class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 6 == 0) {
            answer = n / 6;
        } else if (n % 2 == 0) {
            answer = n / 2;
        } else if (n % 3 == 0) {
            answer = n / 3;
        } else if (n % 5 == 0) {
            answer = n / 5 + 4;
        } else {
            answer = n;
        }
        
        return answer;
    }
}