
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class programmers_wantam1 {
    public static void main(String[] args) {
        int[] answers = { 1, 3, 2, 4, 2 };
        int[] answer = solution(answers);

        System.out.println("answer :: " + Arrays.toString(answer));
    }

    public static int[] solution(int[] answers) {
        int[] answer = new int[3];
        int num = answers.length;
        int[] first = new int[num];
        int[] second = new int[num];
        int[] third = new int[num];
        int fnum = 0;
        int snum = 0;
        int tnum = 0;

        for (int i = 0; i < num; i++) {
            if (i % 5 == 0) {
                first[i] = 1;
            } else if (i % 5 == 1) {
                first[i] = 2;
            } else if (i % 5 == 2) {
                first[i] = 3;
            } else if (i % 5 == 3) {
                first[i] = 4;
            } else if (i % 5 == 4) {
                first[i] = 5;
            }

            if (i % 8 == 0 || i % 8 == 2 || i % 8 == 4 || i % 8 == 6) {
                second[i] = 2;
            } else if (i % 8 == 1) {
                second[i] = 1;
            } else if (i % 8 == 3) {
                second[i] = 3;
            } else if (i % 8 == 5) {
                second[i] = 4;
            } else if (i % 8 == 7) {
                second[i] = 5;
            }

            if (i % 10 == 0 || i % 10 == 1) {
                third[i] = 3;
            } else if (i % 10 == 2 || i % 10 == 3) {
                third[i] = 1;
            } else if (i % 10 == 4 || i % 10 == 5) {
                third[i] = 2;
            } else if (i % 10 == 6 || i % 10 == 7) {
                third[i] = 4;
            } else if (i % 10 == 8 || i % 10 == 9) {
                third[i] = 5;
            }
        }

        for (int i = 0; i < num; i++) {
            if (first[i] == answers[i]) {
                fnum++;
            }
            if (second[i] == answers[i]) {
                snum++;
            }
            if (third[i] == answers[i]) {
                tnum++;
            }
        }
        int max = 0;
        int[] temp = { fnum, snum, tnum };
        int[] temp2 = { fnum, snum, tnum };
        Arrays.sort(temp);
        // System.out.println("temp :: " + Arrays.toString(temp));
        max = temp[2];

        List<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (temp2[i] == max) {
                arr2.add(i + 1);
            }
        }

        answer = new int[arr2.size()];
        for (int i = 0; i < arr2.size(); i++) {
            answer[i] = arr2.get(i);
        }
        // 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
        // 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
        // 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,
        return answer;
    }
}
