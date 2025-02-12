class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length;
        int l = nums2.length;
        int[] temp = new int[m+n];
        int c=0;
        for(int i=0;i<m;i++){
            temp[c++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            temp[c++]=nums2[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<m+n;i++){
            nums1[i]=temp[i];
        }
    }
}