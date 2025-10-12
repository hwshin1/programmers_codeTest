class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer = numer1 * denom2 + denom1 * numer2;
        int denom = (denom1 * denom2);
        
        int[] answer = {
            // 기약분수 덧셈 이용해보기
            numer, // 분자
            denom // 분모
        };
        
        // 약분하기
        int gcd = getGcd(numer, denom);
        
        int[] result = {
            numer / gcd,
            denom / gcd
        };
        
        return result;
    }
    
    // 최대공약수 구하기? 이게 맞나
    public static int getGcd (int numer, int denom) {
        if (denom == 0) {
            return numer;
        }

        return getGcd(denom, numer % denom);
    }
}