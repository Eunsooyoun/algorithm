import java.util.Arrays;

public class p_12915 {

    public static void main(String[] args) {
        // 프로그래머스 lv1_문자열 내 마음대로 정렬하기
        String[] arr = { "abce", "abcd", "cdx" };
        System.out.println(solution(arr, 2));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (strings[j].charAt(n) > strings[j + 1].charAt(n)) {
                    String tmp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = tmp;
                }
            }
        }
        answer = strings;
        // for (int i = 0; i < strings.length; i++) {
        // System.out.println(answer[i]);
        // }
        return answer;
    }

}
