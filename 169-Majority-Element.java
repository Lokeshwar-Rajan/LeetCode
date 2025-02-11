class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length,c=1;;
        int k = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==k){
                c++;
            }else{
                c--;
            }
            if(c==0){
                k=nums[i];
                c=1;
            }
        }
        return k;
    }
}