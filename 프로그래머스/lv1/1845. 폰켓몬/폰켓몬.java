import java.util.ArrayList;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(arrayList.size() == nums.length / 2){
                break;
            }
            if(!arrayList.contains(nums[i])){
                arrayList.add(nums[i]);
            }
        }

        answer = arrayList.size();

        return answer;
    }
}