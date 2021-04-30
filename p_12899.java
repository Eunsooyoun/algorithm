
public class p_12899 {
    public static void main(String[] args) {
        // 프로그래머스 lv2_124나라의 숫자
        System.out.println(solution(22));
    }

    public static String solution(int n) {
        String answer = "";
        int r = 0;
        while (n > 0) {
            r = n % 3;
            if (r == 0) {
                n = n / 3 - 1;
                r = 4;
            } else {
                n = n / 3;
            }
            answer = Integer.toString(r) + answer;
        }

        return answer;

    }
}