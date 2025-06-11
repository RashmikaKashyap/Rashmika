class Solution {
    public void nextPermutation(int[] nums) 
    {
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            reverse(nums,0,n-1); //no break point found
            return; 
        }
        for(int i=n-1;i>index;i--)
        {
            if(nums[index]<nums[i])
            {
                int temp=nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
                break;
            }
        }

        reverse(nums,index+1,n-1);
    }
    int[] reverse(int arr[],int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}