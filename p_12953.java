import java.util.Arrays;

public class p_12953 {

    public static void main(String[] args) {
        // 프로그래머스 lv2_N개의 최소공배수
        int[] arr = { 8, 24 };
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int tmp = arr[0];
        int mult = 1;

        for (int i = 1; i < arr.length; i++) {
            int min = tmp;
            int cnt = 1;
            if (arr[i] < tmp) {
                min = arr[i];
            }
            while (min > cnt) {
                cnt++;
                // System.out.println(cnt);
                if (tmp % cnt == 0 && arr[i] % cnt == 0) {
                    mult *= cnt;
                    tmp /= cnt;
                    arr[i] /= cnt;
                    cnt = 1;
                    // cnt--;
                    // System.out.println(mult + " " + tmp + " " + arr[i]);
                    // System.out.println(min + " " + cnt);
                }
            }
            tmp = tmp * arr[i] * mult;
            mult = 1;
        }
        answer = tmp;
        return answer;
    }
}
