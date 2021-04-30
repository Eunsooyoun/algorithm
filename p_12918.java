
public class p_12918 {
    // 문자열다루기 기본 20210211
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (48 <= s.charAt(i) && s.charAt(i) <= 57) {
                    cnt++;
                }
            }
            if (cnt == s.length()) {
                answer = true;
            } else {
                answer = false;
            }
        } else {
            answer = false;
        }

        return answer;
    }
}
