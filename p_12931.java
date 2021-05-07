
public class p_12931 {
    public static void main(String[] args) {
        // 프로그래머스 lv1_자릿수 더하기
        System.out.println(solution(234));
    }

    public static int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            Integer a = Integer.parseInt(String.valueOf(s.charAt(i)));
            answer += a;
        }

        return answer;
    }

}
