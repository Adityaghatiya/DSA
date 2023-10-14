class Solution {
    public int lengthOfLastWord(String s) {
        String[] arrStr=s.split(" ");
        String st=arrStr[arrStr.length-1];
        int len=st.length();
        return len;
    }
}
