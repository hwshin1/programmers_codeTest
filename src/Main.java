// 문제 설명
// 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
// 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
// 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.

// 제한사항
//array의 길이는 홀수입니다.
//0 < array의 길이 < 100
//-1,000 < array의 원소 < 1,000

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {9, -1, 0};
        System.out.println(solution.solution(a));
    }
}

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int count = array.length;
        int middleCount = (count + 1) / 2;

        int answer = array[middleCount - 1];
        return answer;
    }
}
