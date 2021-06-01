public class p_42860 {

    public static void main(String[] args) {
        // level2_조이스틱
        String s = "AAAB";
        System.out.println(solution(s));
    }

    public static int solution(String name) {
        int answer = 0;
        int min = name.length() - 1;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) <= 'N') {
                answer += (name.charAt(i) - 'A');
            } else {
                answer += ('Z' - name.charAt(i) + 1);
            }

            int next = i + 1;
            while (next < name.length() && name.charAt(next) == 'A') {
                // A의 시작점부터 GOGO
                // A가 어디까지 연속되는지, 최종적으로 A가 연속되는 곳의 마지막 INDEX를 가져옴
                next++;
            }
            min = Math.min(min, i * 2 + name.length() - next);

        }

        answer += min;
        return answer;
    }

}
