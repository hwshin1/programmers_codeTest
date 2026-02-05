class Solution {
    public int[] solution(int[] num_list, int n) {
        int a = num_list.length - (n - 1);
        
        int[] answer = new int[a];
        
        int idx = 0;
        for (int i = n - 1; i < num_list.length; i++) {
            answer[idx] = num_list[i];
            idx++;
        }
        
        return answer;
    }
}