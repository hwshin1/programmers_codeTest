class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for (int i = 0; i < control.length(); i++) {
            String s = control.charAt(i) + "";
            
            if (s.equals("w")) {
                n = n + 1;
            } else if (s.equals("s")) {
                n = n - 1;
            } else if (s.equals("d")) {
                n = n + 10;
            } else if (s.equals("a")) {
                n = n - 10;
            }
            
            answer = n;
        }
        
        return answer;
    }
}