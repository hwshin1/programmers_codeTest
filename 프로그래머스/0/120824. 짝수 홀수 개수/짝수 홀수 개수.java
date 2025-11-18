class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int ecount = 0;
        int acount = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                ecount++;
            } else if (num_list[i] % 2 != 0) {
                acount++;
            }
        }
        
        answer = new int[]{ecount, acount};
        return answer;
    }
}