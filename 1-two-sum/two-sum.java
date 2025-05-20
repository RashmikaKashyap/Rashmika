class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n=nums.length;

        int a[]=new int[2];
        a[0]=a[1]=-1;

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int num=nums[i];
            int rem= target-num;

            if(map.containsKey(rem))
            {
                a[0]=map.get(rem);
                a[1]=i;
                return a;
            }
            map.put(nums[i],i);
        }
        return a;
    }
}