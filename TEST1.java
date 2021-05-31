import java.util.ArrayList;

public class TEST1 {
    public static void main(String[] args) {
        int[] play_list = 
    }

    public static int solution(int[] play_list, int listen_time) {
        int answer = 0;
        int sum = 0;
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        for (int i = 0; i < play_list.length; i++) {
            sum += play_list[i];
        }
        if (sum <= listen_time) {
            answer = play_list.length;
        } else {
            for (int i = 0; i < sum; i++) {

            }
        }
        return answer;
    }
}
