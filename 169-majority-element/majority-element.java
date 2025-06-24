class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int el = Integer.MIN_VALUE; 
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                el=nums[i];

            }
            else if(el==nums[i])cnt++;
            else cnt--;
        }
        return el;
    }
}