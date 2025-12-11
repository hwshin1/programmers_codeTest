class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String c = String.valueOf(a) + String.valueOf(b);
        String d = String.valueOf(b) + String.valueOf(a);
        
        int sum1 = Integer.parseInt(c);
        int sum2 = Integer.parseInt(d);
        
        if (sum1 >= sum2) {
            answer = sum1;
        } else {
            answer = sum2;
        }
        
        return answer;
    }
}