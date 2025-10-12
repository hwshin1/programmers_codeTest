class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = numbers;
        for (int i = 0; i < answer.length; i++) {
            int a = answer[i];
            int result = a*2;
            answer[i] = result;
        }
        return answer;
    }
}