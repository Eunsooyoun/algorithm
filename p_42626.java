
import java.util.PriorityQueue;

public class p_42626 {
    public static void main(String[] args) {
        // 프로그래머스 "lv2_더 맵게"
        int[] scoville = { 1, 2, 3, 9, 10, 12 };
        int K = 7;
        System.out.println(solution(scoville, K));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }

        while (!pq.isEmpty() && pq.peek() < K) {
            int n = pq.poll();
            if (!pq.isEmpty()) {
                int n2 = pq.poll();
                int temp = n + (n2 * 2);
                answer++;
                pq.add(temp);
            } else {
                answer = -1;
            }

        }

        return answer;
    }
}