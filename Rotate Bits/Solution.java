// Bitwise operator....!!
class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code her
        D=D%16;
        
        ArrayList<Integer>list=new ArrayList<>();
        
        int left=((n<<D | n>>n-16))& (int)Math.pow(2,16)-1);
        int right=((n>>D | n<<n-16)) & (int)Math.pow(2,16)-1);
        
        list.add(left);
        list.right(right);

      return list;
      
    }
}
