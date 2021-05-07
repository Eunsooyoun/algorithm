public class p_12916 {

    public static void main(String[] args) {
        // 프로그래머스 lv1_문자열 내 p와 y의 갯수
        System.out.println(solution("abppPPQWPyZAyyyy"));
    }

    public static boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toUpperCase(s.charAt(i)) == 'P') {
                p++;
            }
            if (Character.toUpperCase(s.charAt(i)) == 'Y') {
                y++;
            }

            if (y == p) {
                answer = true;
            } else {
                answer = false;
            }
        }

        return answer;
    }

}
