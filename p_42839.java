
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class p_42839 {

    public static void main(String[] args) {
        // 프로그래머스 lv2_소수 찾기
        System.out.println(solution("011"));
    }

    static Set<Integer> set = new HashSet<Integer>();

    public static int solution(String numbers) {
        int answer = 0;
        String[] arr = numbers.split("");
        for (int i = 1; i <= arr.length; i++) {
            perm(arr, 0, arr.length, i);
        }

        // System.out.println("set :: " + set);

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            if (isPrime(itr.next())) {
                answer++;
            }
        }

        return answer;
    }

    public static void perm(String[] arr, int depth, int n, int r) {
        if (depth == r) {
            int a = makeNum(arr, r);
            // System.out.println(a);
            set.add(a);
            return;
        } else {
            for (int i = depth; i < n; i++) {
                swap(arr, depth, i);
                perm(arr, depth + 1, n, r);
                swap(arr, depth, i);
            }
        }
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int makeNum(String[] arr, int r) {
        String temp = "";
        int num = 0;
        if (arr[0] != "0") {
            for (int i = 0; i < r; i++) {
                temp += arr[i];
            }
            num = Integer.parseInt(temp);
        }
        return num;
    }
}