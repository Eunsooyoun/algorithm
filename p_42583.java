import java.util.Queue;
import java.util.LinkedList;

public class p_42583 {
    public static void main(String[] args) {
        // 프로그래머스 "lv2_다리를 지나는 트럭"
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = { 7, 4, 5, 6 };

        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    private static class Truck {
        int w;
        int t;

        Truck(int w, int t) {
            this.w = w;
            this.t = t;
        }

    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Truck> q = new LinkedList<>(); // 다리건너는
        Queue<Truck> wq = new LinkedList<>(); // 대기

        for (int i = 0; i < truck_weights.length; i++) {
            wq.add(new Truck(truck_weights[i], 0));
        }

        int sum = 0;
        while (!q.isEmpty() || !wq.isEmpty()) {
            answer++;
            if (!q.isEmpty()) {
                if (answer - q.peek().t >= bridge_length) {
                    Truck truck = q.poll();
                    sum -= truck.w;
                }
            }
            if (!wq.isEmpty()) {
                if (sum + wq.peek().w <= weight && q.size() + 1 <= bridge_length) {
                    Truck trk = wq.poll();
                    sum += trk.w;
                    q.add(new Truck(trk.w, answer));
                }
            }
        }

        return answer;
    }

}