import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int mode = 0;
        int[] index = new int[1000];
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            index[array[i]]++;
        }

        for(int i = 0; i < index.length; i++){
            if(max < index[i]){
                max = index[i];
                mode = i;
            }
        }
        
        int count = -1;
        
        for (int i = 0; i < index.length; i++) {
            if (index[mode] == index[i]) {
                count++;
            }
        }
        
        if (count > 0) {
            return -1;
        }
        
        return mode;
    }
}