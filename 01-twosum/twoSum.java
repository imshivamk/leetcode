class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1,-1}; //fallback statement
    }
}

public class twoSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2,1,5,3,8};
        int[] solArr =  sol.twoSum(arr, 8);
        System.out.println(solArr[0]);
        System.out.println(solArr[1]);
    }
}
