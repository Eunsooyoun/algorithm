import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Test2 {

    public static void main(String[] args) {
        int[][] t = { { 0, 1 }, { -1, 1 }, { 1, 0 }, { -2, 2 } };
        System.out.println(solution(-1, 2, 2, 40, t));
    }

    public static int solution(int x, int y, int r, int d, int[][] target) {
        int answer = 0;
        ArrayList<int[]> tmp = new ArrayList<int[]>();
        for (int i = 0; i < target.length; i++) {
            if (distfunc(target[i][0], target[i][1]) <= r) {
                tmp.add(target[i]);
            }
        }
        double u;
        double v;
        double naejeok;
        double gakdo;

        for (int i = 0; i < tmp.size(); i++) {
            u = Math.sqrt(Math.pow((double) x, 2) + Math.pow((double) y, 2));
            v = Math.sqrt(Math.pow((double) tmp.get(i)[0], 2) + Math.pow((double) tmp.get(i)[1], 2));
            naejeok = ((double) x * (double) tmp.get(i)[0]) + ((double) y * (double) tmp.get(i)[1]);
            gakdo = Math.toDegrees(Math.acos(naejeok / (u * v)));
            // System.out.println(gakdo);
            if (gakdo <= d) {

                answer++;
            }

        }

        return answer;
    }

    static double distfunc(int x, int y) {
        double dist = Math.sqrt(Math.pow((double) x, 2) + Math.pow((double) y, 2));
        return dist;
    }

}
