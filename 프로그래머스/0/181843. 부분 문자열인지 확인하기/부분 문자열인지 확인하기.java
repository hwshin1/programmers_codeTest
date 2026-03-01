class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        
        int v = my_string.length() - target.length();
        
        for (int i = 0; i <= v; i++) {
            String cut = my_string.substring(i, i + target.length());
            if (cut.equals(target)) {
                answer = 1;
            }
        }
        
        return answer;
    }
}