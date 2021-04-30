import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class p_42584 {
    public static void main(String[] args) {
        // 프로그래머스 "lv2_주식가격"
        int[] prices = { 1, 2, 3, 2, 3 };
        System.out.println(Arrays.toString(solution(prices)));
    }

    public static int[] solution(int[] prices) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < prices.length; i++) {
            q.add(prices[i]);
        }
        int idx = 0;
        int cnt = 0;
        int p;
        while (!q.isEmpty()) {
            cnt = 0;
            p = q.poll();
            if (idx + 1 < prices.length) {
                for (int i = idx + 1; i < prices.length; i++) {
                    if (prices[i] >= p) {
                        cnt++;
                    } else {
                        cnt++;
                        break;
                    }
                }
            }

            temp.add(idx++, cnt);
        }

        answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }

        return answer;
    }
}