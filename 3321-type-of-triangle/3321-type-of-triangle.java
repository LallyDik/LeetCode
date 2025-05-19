class Solution {
    public String triangleType(int[] nums) {
        if(nums[0] == nums[1] && nums[1] == nums[2]){
            return "equilateral";
        }else{
            int sum1 = nums[0] + nums[1], sum2 = nums[1] + nums[2], sum3 = nums[0] + nums[2];
            if(sum1 <= nums[2] || sum2 <= nums[0] || sum3 <= nums[1]){
                return "none";
            }else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]){
               return "isosceles";
            }
        }
        return "scalene";
    }
}