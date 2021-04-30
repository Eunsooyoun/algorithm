
public class p_12948 {
    // 핸드폰 번호 가리기 20210211
    public static void main(String[] args) {
        String phone_number = "027778888";
        System.out.println(solution(phone_number));

    }

    public static String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer = answer + "*";
        }

        for (int i = phone_number.length() - 4; i < phone_number.length(); i++) {
            answer = answer + phone_number.charAt(i);
        }
        return answer;
    }
}
