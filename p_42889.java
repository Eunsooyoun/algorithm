import java.util.Arrays;

public class p_42889 {

    public static void main(String[] args) {
        // 프로그래머스 lv1_실패율(kakao 2019 blind)
        int[] stages = { 5, 5, 5, 5, 5 };
        solution(6, stages);
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Arrays.sort(stages);
        double p = 0.0;
        double c = 0.0;
        double[] tmp = new double[N];
        Arr[] arr = new Arr[N];
        for (int i = 1; i <= N; i++) {
            c = 0.0;
            p = 0.0;
            for (int j = 0; j < stages.length; j++) {
                if (i == stages[j]) {
                    c++;
                }
                if (i < stages[j]) {
                    p++;
                }
            }

            if (c + p == 0.0) {
                tmp[i - 1] = 0.0;
            } else {
                tmp[i - 1] = c / (c + p);
            }
            Arr a = new Arr(i, tmp[i - 1]);
            arr[i - 1] = a;
        }

        Arrays.sort(arr);
        // System.out.println();

        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i].i);
            // System.out.println(arr[i].sum);
            answer[i] = arr[i].i;
        }

        return answer;
    }

}

class Arr implements Comparable<Arr> {
    int i;
    double sum;

    Arr(int i, double sum) {
        this.i = i;
        this.sum = sum;
    }

    @Override
    public int compareTo(Arr a) {
        if (this.sum < a.sum) {
            return 1; // sum에 대해서는 내림차순
        } else if (this.sum == a.sum) {
            if (this.i > a.i) { // i에 대해서는 오름차순
                return 1;
            }
        }
        return -1;
    }

}
