package part03.week01.marathon;

import java.util.*;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        // 선수 이름을 저장할 해시맵 선언 (이름 → 등장 횟수)
        Map<String, Integer> map = new HashMap<>();

        // 1. 참가자 명단 순회하며 이름 카운트
        for (String name : participant) {
            // 이미 등록된 이름이면 기존 값 +1, 없으면 0에서 시작
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 2. 완주자 명단 순회하며 카운트 차감
        for (String name : completion) {
            // 완주한 사람은 카운트를 -1
            map.put(name, map.get(name) - 1);
        }

        // 3. 카운트가 0이 아닌 사람 = 완주하지 못한 사람
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key; // 해당 이름 반환
            }
        }
        // 정상적인 경우 여기에 도달하지 않지만, 문법적으로 필요함
        return "";
    }
}
