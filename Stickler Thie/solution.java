class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        if(n==1)
        {
            return arr[0];
        }
        if(n==2)
        {
            return Math.max(arr[0],arr[1]);
        }
        int max=0;
        int pop=0;
        int prev=arr[0];
        
        for(int i=1;i<n;i++)
        {
            max=Math.max(prev,pop+arr[i]);
            pop=prev;
            prev=max;
        }
        return max;
        
    }
}
