class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int count =0;
        for(int i=0;i<nums.length;i++)
        {   
            if(set.contains(nums[i])) continue;
            else {
                set.add(nums[i]);
                nums[count]=nums[i];
                count +=1;
            }
        }
        return count;
    }
}