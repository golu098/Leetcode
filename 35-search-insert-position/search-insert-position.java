class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int s=0,e=n-1;
        int ans=n;
        while(s<=e){
            int mid=s+(e-s)/2;
            
            if(nums[mid]<target){
                s=mid+1;
            }
            else{
                ans=mid;
                e=mid-1;

            }
        }
        return ans;
    }
}