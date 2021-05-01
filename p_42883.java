public class p_42883 {
    public static void main(String[] args) {
        // 프로그래머스 lv2_가장 큰 수
        System.out.println(solution("1111111", 4));
    }

    public static String solution(String number, int k) {
        String answer = "";
        StringBuffer ab = new StringBuffer(""); // stringbuffer안쓰고 그냥 answer에다가 +해서 붙이면 timeout남
        int i = 0;
        int index = -1;
        for (i = 0; i < number.length() - k; i++) {
            char max = 0;
            for (int j = index + 1; j <= k + i; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    index = j;
                }
            }
            ab.append(max); // append 처리 해주고 stringbuffer to string 이 더 빠른듯
        }
        answer = ab.toString();
        return answer;
    }

}
