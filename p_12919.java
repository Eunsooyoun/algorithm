
public class p_12919 {

    // 서울에서 김서방 찾기 20210202
    public static void main(String[] args) {
        String[] seoul = { "Jane", "Kim" };
        System.out.println(solution(seoul));
    }

    public static String solution(String[] seoul) {
        int n = 0;
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                n = i;
                break;
            } else {
                continue;
            }
        }
        answer = "김서방은 " + n + "에 있다";
        return answer;
    }

}
