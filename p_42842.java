import java.util.Arrays;

public class p_42842 {

    public static void main(String[] args) {
        // 프로그래머스 lv2_카펫
        System.out.println(Arrays.toString(solution(24, 24)));
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int temp = 0;
        int temp2 = 0;
        for (int i = 3; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                temp = i;
                temp2 = sum / temp;

                if ((temp - 2) * (temp2 - 2) == yellow) {
                    break;
                } else {
                    continue;
                }
            }
        }

        if (temp2 > temp) {
            answer[0] = temp2;
            answer[1] = temp;
        } else {
            answer[1] = temp2;
            answer[0] = temp;
        }
        return answer;
    }
}
