
public class p_12945 {
    public static void main(String[] args) {
        // 프로그래머스 lv2_피보나치 수
        System.out.println(solution(55));
    }

    public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[100001];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }

        answer = arr[n];
        return answer;
    }
}