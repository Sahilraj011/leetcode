class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }else{
                if(st.size()==0)return false;
                char ch=st.peek();
                st.pop();
                if(s.charAt(i)==')'&&ch!='(')
                return false;
                else if(s.charAt(i)==']'&&ch!='['){
                    return false;
                }
                else if(s.charAt(i)=='}'&&ch!='{'){
                    return false;
                }
            }
        }
        return st.size()==0;
    }
}