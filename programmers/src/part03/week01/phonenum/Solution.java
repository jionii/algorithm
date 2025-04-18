package part03.week01.phonenum;

// 어떤 문자열의 "앞부분"이 다른 문자열의 시작과 일치할 때, 그 앞부분을 “접두어”라고 한다.

import java.util.Arrays;

public class Solution {
    public boolean solution(String[] phone_book) {
        // 1. 전화번호 목록을 사전순(오름차순)으로 정렬
        // → 정렬하면 접두어인 경우가 반드시 인접하게 나옴
        Arrays.sort(phone_book);

        // 2. 정렬된 배열에서 앞뒤로 붙은 두 번호만 비교
        for (int i = 0; i < phone_book.length - 1; i++) {
            // 다음 번호가 현재 번호로 시작하는지 확인 (접두어인지)
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false; // 접두어 관계 발견 → 유효하지 않음
            }
        }

        // 3. 끝까지 반복해도 접두어 없으면 true 반환
        return true;
    }
}