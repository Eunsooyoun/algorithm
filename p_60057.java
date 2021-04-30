
public class p_60057 {
    public static void main(String[] args) {
        // 프로그래머스 lv2_문자열 압축하기(2020카카오 blind test)
        // String s = "ababcdcdababcdcd";
        // String s = "ababcdcd";
        // String s = "abcabcdede";
        // String s = "abcabcabcabcdededededede";
        String s = "aababa";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = s.length();
        int len = s.length() / 2;
        int[] arr = new int[s.length()];
        String tmp = "";
        int cnt = 1;
        String save = "";
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < s.length() + i; j += i) {
                String now;
                if (j >= s.length()) {
                    now = "";
                } else if (s.length() < j + i) {
                    now = s.substring(j);
                } else {
                    now = s.substring(j, j + i);
                    // System.out.println("now :: " + now);
                }

                if (j != 0) {
                    if (now.equals(tmp)) {
                        cnt++;
                    } else if (cnt >= 2) {
                        save += cnt + tmp;
                        cnt = 1;
                    } else {
                        save += tmp;
                    }
                }
                // System.out.println("cnt : " + cnt);
                tmp = now;
            }
            System.out.println(save);
            arr[i] = save.length();
            save = "";
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] != 0 && arr[i] < answer) {
                answer = arr[i];
            }
        }
        return answer;
    }

}