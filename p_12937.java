
public class p_12937 {
    // 20210211
    public static void main(String[] args) {
        int num = 5;
        solution(num);
    }

    public static String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }

}
