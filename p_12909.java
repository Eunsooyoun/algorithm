import java.util.Stack;

public class p_12909 {

    public static void main(String[] args) {
        // 프로그래머스 lv2_올바른 괄호
        System.out.println(solution("))((("));
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('(' == c) {
                stack.push(c);
            }
            if (')' == c) {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
