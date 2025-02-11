class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int c=0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                i++;
            }else{
                return nums[i-1];
            }
        }
        return nums[n-1];
    }
}