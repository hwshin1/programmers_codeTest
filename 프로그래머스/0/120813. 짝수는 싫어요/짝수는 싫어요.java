import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int array) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= array; i++) {
            if(i % 2 != 0) {
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}