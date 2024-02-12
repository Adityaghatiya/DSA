class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        // code here
         ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        
        for (int i = 1; i < n; i++) {
            int next = list.get(i - 1) - i;
            if (next < 0 || list.contains(next)) {
                next = list.get(i - 1) + i;
            }
            list.add(next);
        }
        
        return list;
    }
}
