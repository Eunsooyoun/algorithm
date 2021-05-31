public class p_60058 {

    public static void main(String[] args) {
        // level2_괄호변환 카카오 2020 블라인드
        String p = "()))((()";
        System.out.println(solution(p));
    }

    static String answer = "";

    public static String solution(String p) {
        if (p.equals(""))
            return "";
        int idx = index(p);
        String u = p.substring(0, idx + 1);
        String v = p.substring(idx + 1);
        System.out.println(u);
        System.out.println(v);
        System.out.println();

        if (validateString(u)) {
            System.out.println("맞니??");
            answer += u;
        } else {
            answer += "(";
            if (!v.equals("")) {
                solution(v);
                v = "";
            }
            answer += ")";
            answer += setvalidateGrammar(u);
        }
        if (!v.equals("")) {
            solution(v);
        }

        return answer;
    }

    public static int index(String p) {
        int idx = 0;
        int cnt = 0;
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (c == '(') {
                cnt++;
            }
            if (c == ')') {
                cnt--;
            }
            if (cnt == 0) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    public static boolean validateString(String p) {
        int cnt = 0;
        System.out.println("여기!!" + p);
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(')
                cnt++;
            else
                cnt--;
            if (cnt < 0) // 만약 ( 가 먼저나오면 올바른 문자열이 아닐 수 없음!
                return false;
        }
        return true;
    }

    public static String setvalidateGrammar(String p) {
        String tmp = "";
        for (int i = 1; i < p.length() - 1; i++) {
            if (p.charAt(i) == '(') {
                tmp += ")";
            } else {
                tmp += "(";
            }
        }
        return tmp;
    }

}
