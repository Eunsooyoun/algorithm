
public class p_12912 {

    // 두 정수 사이의 합 20210202

    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        System.out.println(solution(a, b));
    }

    public static long solution(int a, int b) {
        long answer = 0;
        long sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        answer = sum;
        return answer;
    }

}
