class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0;
        long count1=0;
        for(int i=0;i<nums1.length;i++)
        {
            sum1=sum1+nums1[i];
            if(nums1[i]==0)
            {
                count1++;
            }
            
        }
        long sum2=0;
        long count2=0;
        for(int i=0;i<nums2.length;i++)
        {
            sum2=sum2+nums2[i];
            if(nums2[i]==0)
            {
                 count2++;
            }
           
        }
        if(sum1==sum2 && count1==0 && count2==0)
        {
            return sum2;
        }
        if(count1==0 && sum2+count2>sum1 || count2==0 && sum1+count1>sum2)
        {
            return -1;
        }
        return Math.max(sum1+count1,sum2+count2);
        
    }
}
