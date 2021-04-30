
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class programmers3 {
    // 해시_위장
    public static void main(String[] args) {
        String[][] input = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
                { "green_turban", "headgear" } };

        int answer = solution(input);

        System.out.println("answer :: " + answer);
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        Arrays.sort(clothes, Comparator.comparing(num1 -> num1[1]));
        List<String> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < clothes.length; i++) {
            arr.add(clothes[i][1]);
        }
        arr = arr.stream().distinct().collect(Collectors.toList());
        System.out.println("arr :: " + (arr));

        for (int i = 0; i < arr.size(); i++) {
            arr2.add(0);
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < clothes.length; j++) {
                if (arr.get(i).equals(clothes[j][1])) {
                    arr2.set(i, arr2.get(i) + 1);
                } else {
                    continue;
                }
            }
        }
        System.out.println("arr2 :: " + (arr2));
        for (int i = 0; i < arr2.size(); i++) {
            answer = answer * (arr2.get(i) + 1);
        }

        answer = answer - 1;
        return answer;
    }
}
