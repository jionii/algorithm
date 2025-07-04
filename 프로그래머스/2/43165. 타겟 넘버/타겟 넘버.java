import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        return backtrack(numbers, target, 0, 0);
    }
    int backtrack(int[] numbers, int target, int sum, int idx) {
        if(idx == numbers.length) {
            return (sum == target) ? 1 : 0;
        }
        int count = 0;
        count += backtrack(numbers, target, sum+numbers[idx], idx+1);
        count += backtrack(numbers, target, sum-numbers[idx], idx+1);
        return count;
    }
}