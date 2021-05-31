import java.util.Arrays;

public class p_12913 {

    public static void main(String[] args) {
        // level2_프로그래머스_땅따먹기
    }

    static int solution(int[][] land) {
        int answer = 0;
        // 전체 탐색은 너무 시간 오래걸림
        for (int i = 0; i < land.length - 1; i++) {
            land[i + 1][0] += Math.max(Math.max(land[i][1], land[i][2]), land[i][3]);
            land[i + 1][1] += Math.max(Math.max(land[i][0], land[i][2]), land[i][3]);
            land[i + 1][2] += Math.max(Math.max(land[i][1], land[i][0]), land[i][3]);
            land[i + 1][3] += Math.max(Math.max(land[i][1], land[i][2]), land[i][0]);
        }

        Arrays.sort(land[land.length - 1]);
        answer = land[land.length - 1][3];
        return answer;
    }
}
