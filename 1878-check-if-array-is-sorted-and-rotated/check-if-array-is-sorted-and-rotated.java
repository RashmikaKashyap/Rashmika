class Solution {
    public boolean check(int[] nums) 
    {
        int n=nums.length;
        int count=0;
        for (int i = 0; i < n; i++) 
        {
            if(nums[i]>nums[(i+1) % n]) //compare with next element
            count++;    //last element should NOT be > first[sorted order]

            if(count>1) return false;
        }
    return true;
  }
}