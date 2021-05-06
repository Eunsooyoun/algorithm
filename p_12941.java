import java.util.Arrays;

public class p_12941 {

    public static void main(String[] args) {
        // 프로그래머스 lv2_최솟값만들기
        int[] a = { 1, 2, 3 };
        int[] b = { 6, 7, 8 };
        solution(a, b);
    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += (A[i] * B[B.length - 1 - i]);
        }
        return answer;
    }

}
