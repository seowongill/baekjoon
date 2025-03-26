import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        int left = 0, right = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int[] answer = new int[2];

        while (true) {
            if (sum >= k) {
                if (sum == k) {
                    int len = right - left;
                    if (len < minLength) {
                        minLength = len;
                        answer[0] = left;
                        answer[1] = right - 1;
                    }
                }
                sum -= sequence[left];
                left++;
            } else {
                if (right == n) break;
                sum += sequence[right];
                right++;
            }
        }

        return answer;
    }
}