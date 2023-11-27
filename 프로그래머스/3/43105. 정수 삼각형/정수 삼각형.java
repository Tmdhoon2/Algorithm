import java.util.Arrays;

public class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;

        triangle[1][0] += triangle[0][0];
        triangle[1][1] += triangle[0][0];
        
        int i;

        for (i = 2; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) {
                    triangle[i][j] += triangle[i - 1][j];
                } else if (j + 1 == triangle[i].length) {
                    triangle[i][j] += triangle[i - 1][j - 1];
                } else {
                    triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
                }
            }
        }
        
        answer = Arrays.stream(triangle[i-1]).max().getAsInt();

        return answer;
    }
}