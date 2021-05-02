import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class p_12906 {
    public static void main(String[] args) {
        // 프로그래머스 lv1_같은 숫자는 싫어
        int[] arr = { 4, 4, 4, 3, 3 };
        System.out.println(solution(arr));
    }

    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        while (!q.isEmpty()) {
            int tmp = q.poll();
            list.add(tmp);
            while (!q.isEmpty() && tmp == q.peek()) {
                q.poll();
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }

        return answer;
    }
}
