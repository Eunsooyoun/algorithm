
public class p_49993 {
    public static void main(String[] args) {
        // 프로그래머스 lv2_스킬트리
        String skill = "CBD";
        String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
        System.out.println(solution(skill, skill_trees));
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String temps = "";
        for (int i = 0; i < skill_trees.length; i++) {
            temps = "";
            for (int j = 0; j < skill_trees[i].length(); j++) {
                String s = skill_trees[i].substring(j, j + 1);
                if (skill.contains(s)) {
                    temps += s;
                }
            }
            // System.out.println(temps);
            int cnt = 0;
            for (int k = 0; k < temps.length(); k++) {
                if (skill.substring(k, k + 1).equals(temps.substring(k, k + 1))) {
                    cnt++;
                } else {
                    break;
                }
            }
            if (cnt == temps.length()) {
                answer++;
            }
        }
        return answer;
    }
}