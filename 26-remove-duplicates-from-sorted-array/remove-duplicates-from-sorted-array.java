class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int i=0;
        for(int j=0;j<nums.length;j++) //O(n) two pointer approach
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1; //to include first element
    }
}
//public int removeDuplicates(int[] nums) // Linked Hash Set O(NlogN + N)
//{
//    LinkedHashSet<Integer> set=new LinkedHashSet<> ();
//    for(int i=0.i<nums.length;i++)
//    {
//        set.add(nums[i]);
//    }
//    int k=set.size();
//}