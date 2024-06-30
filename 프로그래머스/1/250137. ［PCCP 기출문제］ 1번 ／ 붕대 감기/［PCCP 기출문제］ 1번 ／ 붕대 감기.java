class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int[] damages = new int[attacks[attacks.length - 1][0]+1];
        for(int i = 0; i<attacks.length; i++) {
            damages[attacks[i][0]] = attacks[i][1];
        }
        
        int max = bandage[0];
        int secondH = bandage[1];
        int addH = bandage[2];
        
        int current = 0;
        
        for(int i = 0; i<damages.length; i++) {
            if (damages[i] == 0) {
                current++;
                answer += secondH;
                if (current == max) {
                    current = 0;
                    answer += addH;
                }
            } else {
                answer -= damages[i];
                if (answer <= 0) {
                    return -1;
                }
                current = 0;
            }
            
            if (answer > health) {
                answer = health;
            }
        }
        
        for(int i = 0; i<damages.length; i++) {
             System.out.print(damages[i] + " ");
        }
        return answer;
    }
}