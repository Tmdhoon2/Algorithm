import java.util.*;

class Solution {
    
    private HashSet<String> set = new HashSet<>();
    
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        String last = String.valueOf(words[0].charAt(words[0].length()-1));
                
        for(int i = 0; i<words.length; i++) {
            String word = words[i];
            String first = String.valueOf(word.charAt(0));
            if (!last.equals(first) && i != 0) {
                if ((i + 1) % n == 0) {
                    answer[0] = n;
                } else {
                    answer[0] = (i + 1) % n;
                }
                answer[1] = (int) Math.ceil((i + 1) / (double) n);
                break;
            } else if (set.contains(word)) {
                if ((i + 1) % n == 0) {
                    answer[0] = n;
                } else {
                    answer[0] = (i + 1) % n;
                }
                answer[1] = (int) Math.ceil((i + 1) / (double) n);
                break;
            } else {
                set.add(word);
                last = String.valueOf(word.charAt(word.length()-1));
            }
        }

        return answer;
    }
}