public class p_12901 {

    // 2016 20210202
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(solution(a, b));
    }

    public static String solution(int a, int b) {
        String answer = "";
        String[] days = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
        int sum = 0;
        // 2016년은 윤년 (2월이 29일까지)
        for (int i = 1; i < a; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                sum += 31;
            } else if (i == 2) {
                sum += 29;
            } else {
                sum += 30;
            }
        }
        sum += b;
        int mod = sum % 7;
        answer = days[mod];
        return answer;
    }
}
