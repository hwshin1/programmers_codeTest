import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for (int i = 0; i < a.length(); i++) {
            int tmp = (int)a.charAt(i);

            if (65 <= tmp && tmp <= 90) {
                answer += String.valueOf((char)(tmp + 32));
            } else if (tmp >= 97 && tmp <= 122) {
                answer += String.valueOf((char)(tmp - 32));
            } else {
                answer = String.valueOf((char)tmp);
            }
        }
        
        System.out.println(answer);
    }
}