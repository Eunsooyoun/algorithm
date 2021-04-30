
public class p_42862 {
    // 체육복 20210213

    public static void main(String[] args) {
        System.out.println("case1");
        System.out.println(solution(5, new int[] { 2, 4 }, new int[] { 1, 3, 5 }));
        System.out.println("case2");
        System.out.println(solution(5, new int[] { 2, 4 }, new int[] { 3 }));
        System.out.println("case3");
        System.out.println(solution(3, new int[] { 3 }, new int[] { 1 }));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        answer = n - lost.length;// 우선 체육복 잃어버린애들 빼주기

        // 체육복 여벌 있고, 잃어버린애 ->빌려줄 순 없고 본인만 입을 수 있음
        // 잃어버린것도 없는일, 여분 가져온것도 없는일
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = reserve[j] = -1;
                    break;
                }
            }
        }
        // System.out.println("case11");
        // for (int i = 0; i < lost.length; i++) {
        // System.out.printf(" %d ", lost[i]);
        // }
        // System.out.println();
        // System.out.println("case22");
        // for (int i = 0; i < reserve.length; i++) {
        // System.out.printf(" %d ", reserve[i]);
        // }
        // System.out.println();
        // 여벌 빌려줄 수 있는 친구
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] != -1 && reserve[j] != -1) {
                    if (reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
                        answer++;
                        reserve[j] = -1;
                        break;
                    }
                }
            }
        }
        // System.out.println();
        // System.out.println("case33");
        // for (int i = 0; i < lost.length; i++) {
        // System.out.printf(" %d ", lost[i]);
        // }
        // System.out.println();
        // System.out.println("case44");
        // for (int i = 0; i < reserve.length; i++) {
        // System.out.printf(" %d ", reserve[i]);
        // }
        return answer;
    }
}
