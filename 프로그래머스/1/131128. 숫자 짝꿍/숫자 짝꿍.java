import java.util.*;

class Solution {
    
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        int[] xArray = new int[10];
        int[] yArray = new int[10];
        
        for(int i = 0; i<X.length(); i++) {
            char x = X.charAt(i);
            xArray[Integer.parseInt(String.valueOf(x))]++;
        }
        
        for(int i = 0; i<Y.length(); i++){
            char y = Y.charAt(i);
            yArray[Integer.parseInt(String.valueOf(y))]++;
        }
        
        for(int i = 9; i>=0; i--) {
            while(xArray[i] > 0 && yArray[i] > 0) {
                xArray[i]--;
                yArray[i]--;
                sb.append(i);
            }
        }
        
        if (sb.toString().isEmpty()) {
            return "-1";
        } else if (sb.toString().charAt(0) == '0') {
            return "0";
        }
        
        return sb.toString();
    }
}