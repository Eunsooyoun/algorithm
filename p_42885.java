import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p_42885 {

    public static void main(String[] args) {
        // 프로그래머스 lv2_구명보트
        int[] people = { 70, 50, 80 };
        int limit = 100;

        System.out.println(solution(people, limit));
    }

    public static int solution(int[] people, int limit) {
        // 시간초과 해결 (list에서 remove 안하는 방식으로 변경)
        int answer = 0;
        Arrays.sort(people);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = people.length - 1; i >= 0; i--) {
            list.add(people[i]);
        }

        int j = list.size() - 1;
        int i = 0;
        while (i <= j) {
            if (i == j) {
                answer++;
                i++;
                j--;
            } else {
                if (list.get(i) + list.get(j) <= limit) {
                    j--;
                }
                i++;
                answer++;
            }
        }

        return answer;
    }

    // public static int solution(int[] people, int limit) {
    // int answer = 0;
    // Arrays.sort(people);
    // List<Integer> list = new ArrayList<Integer>();
    // for (int i = people.length - 1; i >= 0; i--) {
    // list.add(people[i]);
    // }
    // while (list.size() > 0) {
    // if (list.size() > 1 && list.get(0) + list.get(list.size() - 1) <= limit) {
    // list.remove(list.size() - 1);
    // }
    // answer++;
    // list.remove(0);
    // }

    // return answer;
    // }

}
