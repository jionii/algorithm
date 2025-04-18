package part03.week01.budget;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0; // 최종적으로 지원 가능한 부서 수를 저장할 변수

        Arrays.sort(d); // 신청 금액을 오름차순 정렬하여, 적은 금액부터 먼저 지원

        for(int i = 0; i < d.length; i++) { // 각 부서의 신청 금액을 하나씩 확인
            if ( budget >= d[i]) { // 현재 예산으로 해당 부서 금액을 지원할 수 있다면
                budget -= d[i]; // 해당 금액을 예산에서 차감하고
                answer++; // 지원한 부서 수 증가
            } else { // 예산보다 신청 금액이 크면
                break; // 더 이상 지원 불가 → 반복문 종료
            }
        }

        return answer; // 최종 지원 가능한 부서 수 반환
    }
}
