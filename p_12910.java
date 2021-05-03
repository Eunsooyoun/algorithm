import java.util.*;

public class p_12910 {
    public static void main(String[] args) {
        // 프로그래머스 lv1_나누어 떨어지는 숫자 배열
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        int[] answer = {};
        if (list.size() <= 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
        }
        return answer;
    }

}
