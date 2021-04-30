
public class programmers_dfsbfs1 {
    static int answer = 0;

    public static void main(String[] args) {
        int[] numbers = { 1, 1, 1, 1, 1 };
        int target = 3;
        int answer = solution(numbers, target);

        System.out.println("answer :: " + answer);
    }

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
