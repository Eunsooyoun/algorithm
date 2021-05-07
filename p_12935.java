import java.util.*;

public class p_12935 {

    public static void main(String[] args) {
        // 프로그래머스 lv1_제일 작은 수 제거하기
        int[] arr = { 6, 5, 2, 1, 7, 9, 4 };
        System.out.println(solution(arr));

    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int min = 99999;
        int tmp = 0;
        if (arr.length == 1) {
            answer = new int[arr.length];
            answer[0] = -1;
        } else {
            answer = new int[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    tmp = i;
                }
            }

            list.remove(tmp);
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
                // System.out.println(answer[i]);
            }
        }

        return answer;
    }

}
