
public class p_12939 {
    public static void main(String[] args) {
        // 프로그래머스 lv2_최댓값과 최솟값
        System.out.println(solution("-1 -2 -3 -4"));
    }

    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        Integer max = Integer.valueOf(arr[0]);
        Integer min = Integer.valueOf(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (Integer.valueOf(arr[i]).compareTo(max) > 0) {
                max = Integer.valueOf(arr[i]);
            }
            if (Integer.valueOf(arr[i]).compareTo(min) < 0) {
                min = Integer.valueOf(arr[i]);
            }
        }
        answer = min + " " + max;
        return answer;
    }
}
