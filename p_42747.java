
public class p_42747 {
    public static void main(String[] args) {
        // 프로그래머스 lv2_H-Index
        int[] citations = { 3, 0, 6, 1, 5 };
        System.out.println(solution(citations));

    }

    public static int solution(int[] citations) {
        int answer = 0;
        int h = 0;
        int hcnt = 0;
        int lcnt = 0;
        int temp = 0;
        for (int i = 0; i < citations.length; i++) {
            if (temp <= citations[i]) {
                temp = citations[i];
            }
        }
        for (int i = 0; i < temp; i++) {
            h = i;
            hcnt = 0;
            lcnt = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= h) {
                    hcnt++;
                } else if (citations[j] <= h) {
                    lcnt++;
                }
            }
            if (hcnt >= h && lcnt <= h && answer <= h) {
                answer = h;
            }
        }
        return answer;
    }
}
