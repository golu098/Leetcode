class Solution {
    public boolean check(int[] nums) {
        int cnt=0;
        int n=nums.length;
     for(int i=1;i<nums.length;i++){
        if(nums[i-1]>nums[i]){
            cnt++;
        }
     }  
     if(nums[n-1]>nums[0])cnt++;
     return cnt<=1; 
    }
}