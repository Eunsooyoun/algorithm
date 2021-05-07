public class p_12926 {

    public static void main(String[] args) {
        System.out.println(solution(" aBZ", 20));
        System.out.println(solution("y X Z", 4));
        System.out.println(solution(" . h z", 20));
    }

    public static String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer += ' ';
            } else {
                if (c <= 90) {
                    c += n;
                    if (c > 90) {
                        c -= 26;
                    }
                } else {
                    c += n;
                    if (c > 122) {
                        c -= 26;
                    }
                }
                answer += c;
            }
        }
        return answer;
    }

}
