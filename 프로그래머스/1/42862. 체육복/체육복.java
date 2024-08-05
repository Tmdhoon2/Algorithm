import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> losts = new HashSet<>();
        Set<Integer> reserves = new HashSet<>();
        
        for(int i = 0; i<lost.length; i++) {
            losts.add(lost[i]);
        }
        
        for(int r: reserve) {
            if (losts.contains(r)) {
                losts.remove(r);
            } else {
                reserves.add(r);
            }
        }
        
        int answer = n - losts.size();
        
        for(int l: losts) {
            System.out.println(l);
            if (reserves.contains(l - 1)) {
                reserves.remove(l - 1);
                answer++;
            } else if (reserves.contains(l + 1)) {
                reserves.remove(l + 1);
                answer++;
            }
        }
        
        return answer;
    }
}