import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = getCount(n);
        int N = n;
        
        while(true) {
            N++;
            if (count == getCount(N)) {
                answer = N;
                break;
            }
        }
        
        return answer;
    }
    
    public int getCount(int n) {
        int N = n;
        int result = 0;
        
        while(N != 1) {
            if (N % 2 == 1) {
                result++;
            }
            N /= 2;
        }
        
        return result;
    }
}