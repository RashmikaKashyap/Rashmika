class Solution {
    public int[] moveZeroes(int[] nums) 
    {                                   //2 pointer aaproach
        int j=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
            j=i;
            break;
            }
        }

        if(j==-1)return nums; //no 0's

        for(int i=j+1;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
}