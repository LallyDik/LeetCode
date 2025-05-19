class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int [2];
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            res.put(nums[i], target - nums[i]);
        }
        int j=-1, k=-1, l=-1 ;
        List list = new ArrayList(res.values());
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] * 2 == target){
                for (int m = i + 1; m < nums.length; m++){
                    if(nums[i] == nums[m]){
                        result[0] = i;
                        result[1] = m;
                        return result;
                    }
                }
            }
            if(list.contains(nums[i]) && nums[i] * 2 != target){
                j = i;
            }
            if(j!=-1){
                l = target - nums[j];
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == l){
                k= i;
            }
        }
        result[0] = j;
        result[1] = k;
        return result;
    }
}