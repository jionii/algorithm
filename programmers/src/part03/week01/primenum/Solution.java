package part03.week01.primenum;

import java.util.*;

public class Solution {
    public int solution(int[] nums) {
        int result = 0; // 소수인 조합의 개수를 저장할 변수
        int sum = 0;    // 세 수를 더한 합을 저장할 변수

        // 세 개의 숫자를 고르는 3중 반복문 (i < j < k)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k]; // 세 수의 합

                    // 해당 합(sum)이 소수인지 판별
                    boolean isPrime = true; // 소수라고 가정하고 시작
                    if (sum < 2) {
                        isPrime = false; // 2보다 작으면 소수가 아님
                    } else {
                        for (int x = 2; x <= Math.sqrt(sum); x++) {
                            if (sum % x == 0) {
                                isPrime = false; // 나눠떨어지면 소수 아님
                                break;
                            }
                        }
                    }

                    if (isPrime) {
                        result++; // 소수라면 개수 증가
                    }
                }
            }
        }
        return result; // 소수가 된 조합 개수 반환
    }
}