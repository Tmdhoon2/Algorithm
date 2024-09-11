import java.util.*;

class Solution {
    
    private ArrayList<Integer> list1 = new ArrayList<>();
    private ArrayList<Integer> list2 = new ArrayList<>();
    
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        
        for(int n: arr) {
            list1.add(n);
        }
        
        for(int d: delete_list) {
            list2.add(d);
        }
        
        for(int n: list2) {
            list1.remove(new Integer(n));
        }
        
        return list1;
    }
}