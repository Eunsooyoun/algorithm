
public class programmers_dfsbfs2 {
    public static void main(String[] args) {
        int[][] computers = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };
        int n = 3;
        int answer = solution(n, computers);
        System.out.println(answer);
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                dfs(i, computers, check);
                answer++;
            }
        }
        return answer;
    }

    public static void dfs(int i, int[][] computers, boolean[] check) {
        check[i] = true;

        for (int j = 0; j < computers.length; j++) {
            if (i != j && computers[i][j] == 1 && check[j] == false) {
                dfs(j, computers, check);
            }
        }
    }
}
