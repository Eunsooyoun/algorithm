public class p_12924 {

    public static void main(String[] args) {
        // 프로그래머스 lv2_숫자의 표현
        solution(15);
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int cnt = i;
            while (sum < n) {
                sum += (cnt++);
                if (sum == n) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
