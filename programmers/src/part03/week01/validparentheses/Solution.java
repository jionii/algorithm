package part03.week01.validparentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        // 여는 괄호를 저장할 스택 선언 (후입선출 구조 활용)
        Stack<Character> stackStr = new Stack<>();

        // 문자열의 각 문자를 순회
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // 문자열 s에서 i번째 문자 하나를 꺼내서 c에 저장해라

            // 1. 여는 괄호일 경우 → 스택에 push
            if (ch == '(' || ch == '{' || ch == '[') {
                stackStr.push(ch);
            } else { // 2. 닫는 괄호일 경우
                // 스택이 비어있으면 짝이 맞을 수 없으므로 false
                if (stackStr.isEmpty()) return false;

                // 스택의 맨 위에 있는 괄호 확인
                char top = stackStr.peek();

                // 현재 닫는 괄호와 스택의 top이 짝이 맞는지 확인
                if ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')) {
                    stackStr.pop(); // 짝이 맞으면 스택에서 제거
                } else {
                    return false; // 짝이 안 맞으면 유효하지 않음
                }
            }
        }

        // 반복이 끝난 후 스택이 비어 있어야 유효한 괄호
        return stackStr.isEmpty();
    }
}