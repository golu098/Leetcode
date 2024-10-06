class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
         List<List<Integer>> res = new ArrayList<>();
        // List<List<Integer>> res=new List<List<Integer>> <>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
              // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue; 
            int low=i+1,high=n-1;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0){
                    // res.add({nums[i],nums[low],nums[high]});
                      res.add(new ArrayList<>(Arrays.asList(nums[i], nums[low], nums[high])));
                    // Skip duplicates for low
                    while(low<high && nums[low]==nums[low+1])low++;
                    while(low<high && nums[high]==nums[high-1])high--;
                    low++;
                    high--;
                }
                else if(sum>0){
                    high--;
                }
                else{
                    low++;
                }
            }
           
        }
         return res;
    }
    
}