import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class p_42888 {

    public static void main(String[] args) {
        // level_2 오픈채팅방 카카오 2019블라인드
    }

    public String[] solution(String[] record) {
        ArrayList<String> response = new ArrayList<String>();
        Map<String, String> uid = new HashMap<String, String>();
        for (int i = 0; i < record.length; i++) {
            String[] tmp = record[i].split(" ");
            if (tmp[0].equals("Enter")) {
                uid.put(tmp[1], tmp[2]);
                response.add(tmp[1] + "님이 들어왔습니다.");
            }
            if (tmp[0].equals("Leave")) {
                response.add(tmp[1] + "님이 나갔습니다.");
            }
            if (tmp[0].equals("Change")) {
                uid.put(tmp[1], tmp[2]);
            }
        }
        // System.out.println(uid);
        String[] answer = new String[response.size()];
        for (int i = 0; i < response.size(); i++) {
            String[] arr = response.get(i).split("님이");
            answer[i] = uid.get(arr[0]) + "님이" + arr[1];
            // System.out.println(answer[i]);
        }

        return answer;
    }

}
