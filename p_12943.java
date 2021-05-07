public class p_12943 {

    public static void main(String[] args) {
        // 프로그래머스 lv1_콜라츠 추측
        System.out.println(solution(6));
    }

    public static int solution(int num) {
        long tmp = num;
        int answer = 0;
        while (answer <= 500 && tmp != 1) {
            if (tmp % 2 == 0) {
                tmp /= 2;
                answer++;
            } else {
                tmp = (tmp * 3) + 1;
                answer++;
            }
        }

        if (answer > 500) {
            answer = -1;
        }
        return answer;
    }

}
