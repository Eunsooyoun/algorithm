
public class p_12903 {

    // 가운데 글자 가져오기 20210202

    public static void main(String[] args) {
        // String s = "abcde";
        String s = "qwer";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) {
            answer = s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
        } else {
            answer = s.substring(s.length() / 2, (s.length() / 2) + 1);
        }
        return answer;
    }
}
