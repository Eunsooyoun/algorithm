
import java.util.Arrays;
import java.util.Comparator;

public class programmers_array2 {
    // 정렬 가장 큰 수
    public static void main(String[] args) {
        int[] numbers = { 3, 30, 34, 5, 9 };
        // { 6, 10, 2 };
        String answer = solution(numbers);

        System.out.println("answer :: " + answer);
    }

    public static String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return ((o2 + o1).compareTo(o1 + o2));
            }
        });

        for (int i = 0; i < arr.length; i++) {
            answer = answer + arr[i];
        }

        if (arr[0].equals("0")) {
            return "0";
        }
        return answer;
    }

}
