class Solution {
    public List<String> letterCasePermutation(String s) {
        int n = s.length();
        int i=0;
        List<String> ans = new  ArrayList<>();
        StringBuilder sb = new StringBuilder();
        func(s,ans,i,n,sb);
        return ans;
    }
    public void func(String s, List<String> ans, int i,int n, StringBuilder sb)
    {
        if(i == n)
        {
            ans.add(sb.toString());
            return;
        }
        if(Character.isDigit(s.charAt(i)))
        {
           sb.append(s.charAt(i));
           func(s,ans,i+1,n ,sb); 
           sb.deleteCharAt(sb.length()-1);
        }
        else
        {
            sb.append(Character.toLowerCase(s.charAt(i)));
            func(s,ans,i+1,n, sb);
            sb.deleteCharAt(sb.length()-1);
            sb.append(Character.toUpperCase(s.charAt(i)));
            func(s,ans,i+1,n ,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}