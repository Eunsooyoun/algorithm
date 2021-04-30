
import java.util.Arrays;

public class programmers2 {
    // 해시_전화번호 목록
    public static void main(String[] args) {
        String[] input = { "119", "97674223", "1195524421" };
        boolean answer = solution(input);

        System.out.println("answer :: " + answer);
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        // int len = phone_book[0].length();
        Arrays.sort(phone_book);
        for (int i = 1; i < phone_book.length; i++) {
            if (phone_book[i].startsWith(phone_book[0])) {
                // if (phone_book[0].equals(phone_book[i].substring(0, len))) {
                answer = false;
                break;
            } else {
                continue;
            }
        }
        return answer;
    }
}
