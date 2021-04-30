
import java.util.Arrays;

public class programmers1 {
    // 해시_완주하지 못한 선수
    public static void main(String[] args) {
        String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
        String[] completion = { "josipa", "filipa", "marina", "nikola" };

        String answer = solution(participant, completion);

        System.out.println("answer :: " + answer);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        String temp = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        System.out.println("participant : " + Arrays.toString(participant));
        System.out.println("completion : " + Arrays.toString(completion));

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                temp = participant[i];
                break;
            } else {
                continue;
            }
        }
        System.out.println("temp : " + temp);
        if (!"".equals(temp)) {
            answer = temp;
        } else {
            answer = participant[completion.length];
        }
        return answer;
    }
}
