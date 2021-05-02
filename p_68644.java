import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class p_68644 {

    public static void main(String[] args) {
        // 프로그래머스 lv1_두개 뽑아서 더하기
        int[] arr = { 1, 3, 5, 2, 3, 3, 4, 5, 2, 1, 100 };
        System.out.println(solution(arr));
    }

    public static int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        int i = 0;
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            answer[i++] = itr.next();
            // System.out.println(answer[i]);
        }

        Arrays.sort(answer);
        return answer;
    }

}
