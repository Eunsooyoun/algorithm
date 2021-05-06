public class p_12911 {
    public static void main(String[] args) {
        // 프로그래머스 lv2_다음 큰 숫자
        System.out.println(solution(73));
    }

    public static int solution(int n) {
        int answer = 0;
        String tmp = "";
        String s = Integer.toBinaryString(n);
        int cnt = 0; // 1의 갯수
        int add = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            }
        }
        boolean isTrue = true;
        while (isTrue) {
            tmp = Integer.toBinaryString(++n);
            for (int i = 0; i < tmp.length(); i++) {
                if (tmp.charAt(i) == '1')
                    add++;
            }

            if (cnt == add) {
                isTrue = false;
            }

            add = 0;
        }

        answer = Integer.parseInt(tmp, 2);

        return answer;
    }

}
