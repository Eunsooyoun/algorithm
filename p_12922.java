
public class p_12922 {

    // 수박수박수박수박수박수? 20210202

    public static void main(String[] args) {
        int n = 11;
        System.out.println(solution(n));
    }

    public static String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                answer = "수";
            } else if (i % 2 == 1) {
                answer = answer + "박";
            } else {
                answer = answer + "수";
            }
        }
        return answer;
    }

}
