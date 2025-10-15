class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 7 == 0) {
            answer = n / 7;
        } else if (n % 7 == 1) {
            answer = n / 7 + 1;
        } else if (n % 7 == 2) {
            answer = n / 7 + 1;
        } else if (n % 7 == 3) {
            answer = n / 7 + 1;
        } else if (n % 7 == 4) {
            answer = n / 7 + 1;
        } else if (n % 7 == 5) {
            answer = n / 7 + 1;
        }
        
        return answer;
    }
}