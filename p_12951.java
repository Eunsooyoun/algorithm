public class p_12951 {

    public static void main(String[] args) {
        // 프로그래머스 lv2_JadenCase 문자열 만들기
        System.out.println(solution(" have a NicE dAY"));
    }

    public static String solution(String s) {
        String answer = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                answer += " ";
                i++;
                continue;
            }
            answer += Character.toUpperCase(s.charAt(i++));
            while (i < s.length() && s.charAt(i) != ' ') {
                answer += Character.toLowerCase(s.charAt(i++));
            }

            if (i < s.length()) {
                answer += " ";
            }
            i++;
        }

        return answer;
    }
}
