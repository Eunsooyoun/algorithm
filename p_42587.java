
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class p_42587 {
    public static void main(String[] args) {
        int[] p = { 1, 1, 9, 1, 1, 1 };
        int l = 0;
        System.out.println(solution(p, l));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }
        while (!pq.isEmpty()) {
            System.out.println(Arrays.toString(priorities));
            System.out.println(pq);
            for (int i = 0; i < priorities.length; i++) {
                System.out.println(Arrays.toString(priorities));
                System.out.println(pq);
                System.out.println("i :: " + i);
                if (pq.peek() == priorities[i]) {
                    System.out.println("pq.peek() : " + pq.peek());
                    System.out.println("priorities[i] : " + priorities[i]);
                    if (i == location) {
                        answer++;
                        return answer;
                    }
                    pq.poll();
                    answer++;
                    System.out.println(answer);
                }
            }
        }

        return answer;
    }
}
