

class Solution {
    
    private int[] hList = {-1, 0, 1, 0};
    private int[] wList = { 0, 1, 0, -1 };
    
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String center = board[h][w];
                
        int width = board[0].length;
        int height = board.length;
        
        for(int i = 0; i<4; i++) {
            int nextW = w + wList[i];
            int nextH = h + hList[i];
            if ((nextW >=  0 && nextW < width) && (nextH >= 0 && nextH < height)) {
                System.out.println(board[nextH][nextW] + " " + center);
                if (board[nextH][nextW].equals(center)) answer++;
            } 
        }
        
        return answer;
    }
}