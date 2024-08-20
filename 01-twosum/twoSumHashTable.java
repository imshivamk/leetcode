import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(numsMap.containsKey(complement)){
                return new int[] {numsMap.get(complement), i};
            }
            numsMap.put(nums[i], i);
            // we put the element in the table after checking to avoid 
            // adding the same element together and return the sameindex twice
        }
        return new int[] {}; //fallback statement
    }
}

