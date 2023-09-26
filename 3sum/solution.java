class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
       Arrays.sort(arr);
       List<List<Integer>>list1=new ArrayList<>();
       int n=arr.length-1;
       HashSet<ArrayList<Integer>>set=new HashSet<>();

       for(int i=0;i<arr.length;i++)
       {
           int s=i+1;
           int e=n;

           while(s<e)
           {
               int sum=arr[i]+arr[s]+arr[e];
              
               if(sum==0)
               {
                   ArrayList<Integer>l1=new ArrayList<>(Arrays.asList(arr[i],arr[s],arr[e]));
                   if(!set.contains(l1))
                   {
                      set.add(l1);
                      list1.add(l1);
                   }
                   s++;
                   e--;
               }
               else if(sum<0)
               {
                   s++;
               }
               else{
                   e--;
               }
           }
       }
     return list1;       
    }
}
