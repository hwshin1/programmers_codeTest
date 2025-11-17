import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 15500;
        System.out.println(Arrays.toString(solution.solution(n)));
    }
}

class Solution {
    public int[] solution(int money) {
        return new int[] {money / 5500 , money % 5500};
    }
}
