public class p_43165 {
    public static void main(String[] args) {
        // 프로그래머스 lv2_타겟 넘버
        int[] numbers = { 1, 1, 1, 1, 1 };
        int target = 3;
        System.out.println(solution(numbers, target));
    }

    static int answer = 0;

    public static int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        // System.out.println("answer in solution :: " + answer);

        return answer;
    }

    public static void dfs(int[] numbers, int target, int index, int num) {
        if (index == numbers.length) {
            if (target == num) {
                answer++;
            }
        } else {
            dfs(numbers, target, index + 1, num + numbers[index]);
            dfs(numbers, target, index + 1, num - numbers[index]);
        }

    }
}