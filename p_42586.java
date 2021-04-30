import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class p_42586 {
    // 프로그래머스 "lv2_기능개발"
    public static void main(String[] args) {

        int[] progresses = { 93, 30, 55 };
        // {95, 90, 99, 99, 80, 99};
        int[] speeds = { 1, 30, 5 };
        // {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = null;
        List<Integer> temp = new ArrayList<Integer>();
        Queue<Integer> q = new LinkedList<>();
        int idx = 0;
        for (int i = 0; i < progresses.length; i++) {
            for (int j = 1; j <= 100; j++) {
                if ((100 - progresses[i]) <= (speeds[i] * j)) {
                    q.add(j);
                    break;
                }
            }
        }

        while (!q.isEmpty()) {
            int cnt = 0;
            int n = q.poll();
            cnt++;
            while (!q.isEmpty() && q.peek() <= n) {
                q.poll();
                cnt++;
            }
            temp.add(idx++, cnt);

        }

        answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            // if (temp.get(i) > 0) {
            answer[i] = temp.get(i);
            // }
        }

        return answer;
    }
}