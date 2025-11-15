class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        int saved = 0;
        int result = 0;
        
        result = money / 5500;
        saved = money - (5500 * (money / 5500));
        answer = new int[]{result, saved};
        
        return answer;
    }
}