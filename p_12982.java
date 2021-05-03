import java.util.Arrays;

public class p_12982 {
    public static void main(String[] args) {
        // 프로그래머스 lv1_예산
        int[] d = { 1, 3, 2, 5, 4, 1, 1, 2, 3 };
        int budget = 9;
        System.out.println(solution(d, budget));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if (budget >= d[i]) {
                budget -= d[i];
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}
