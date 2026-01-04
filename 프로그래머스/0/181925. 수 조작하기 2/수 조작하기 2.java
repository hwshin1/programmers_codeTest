class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for (int i = 0; i < numLog.length; i++) {
            if (i == 0) {
                continue;
            }
            
            int num = numLog[i - 1];
            int num2 = numLog[i];

            if (num + 1 == num2) {
                answer += "w";
            }
            if (num - 1 == num2) {
                answer += "s";
            }
            if (num + 10 == num2) {
                answer += "d";
            }
            if (num - 10 == num2) {
                answer += "a";
            }
        }
        
        return answer;
    }
}