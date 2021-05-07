public class p_12930 {

    public static void main(String[] args) {
        // 프로그래머스 lv1_이상한 문자 만들기
        System.out.println(solution("tryy hello world"));
    }

    public static String solution(String s) {
        String answer = "";
        int i = 0;
        int total = 0;
        while (total < s.length()) {
            while (total < s.length() && s.charAt(total) != ' ') {
                if (i == 0 || i % 2 == 0) {
                    answer += Character.toUpperCase(s.charAt(total++));
                    i++;
                } else {
                    answer += Character.toLowerCase(s.charAt(total++));
                    i++;
                }
            }
            i = 0;
            if (s.length() != total) {
                answer += s.charAt(total++);
            }
        }
        return answer;
    }
}
