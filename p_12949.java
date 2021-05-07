public class p_12949 {

    public static void main(String[] args) {
        // 프로그래머스 lv2_행렬의 곱셈
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {// 행은 앞쪽꺼
            for (int j = 0; j < arr2[0].length; j++) {// 열은 뒤쪽꺼
                for (int k = 0; k < arr2.length; k++) {
                    answer[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }

        // for (int i = 0; i < answer.length; i++) {
        // for (int j = 0; j < answer[0].length; j++) {
        // System.out.print(answer[i][j] + " ");
        // }
        // System.out.println();
        // }
        return answer;
    }

}
