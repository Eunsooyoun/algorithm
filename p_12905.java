public class p_12905 {

    public static void main(String[] args) {
        // level2_가장 큰 정사각형
    }

    public int solution(int[][] board) {
        int answer = 0;

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    if (board[i - 1][j] >= 1 && board[i][j - 1] >= 1 && board[i - 1][j - 1] >= 1) {
                        board[i][j] += Math.min(Math.min(board[i - 1][j - 1], board[i - 1][j]), board[i][j - 1]);
                    }
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (answer < board[i][j]) {
                    answer = board[i][j];
                }
                if (board[i][j] == 0) {
                    cnt++;
                }
            }
            // System.out.println();
        }

        if (answer == 0) {
            if (cnt == (board.length * board[0].length)) {
                answer = 0;
            } else {
                answer = 1;
            }
        }

        answer *= answer;
        return answer;
    }
}