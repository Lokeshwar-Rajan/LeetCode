class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=Arrays.binarySearch(nums,target);
        if(n>=0){
            return n;
        }
        else {
            return -(n + 1);
        }        
    }
}