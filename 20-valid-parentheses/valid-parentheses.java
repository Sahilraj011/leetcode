// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();

//         for (int i = 0; i < s.length(); i++) {
//             char cur = s.charAt(i);
//             if (!stack.isEmpty()) {
//                 char last = stack.peek();
//                 if (isPair(last, cur)) {
//                     stack.pop();
//                     continue;
//                 }
//             }
//             stack.push(cur);
//         }

//         return stack.isEmpty();        
//     }

//     private boolean isPair(char last, char cur) {
//         return (last == '(' && cur == ')') ||
//                (last == '{' && cur == '}') ||
//                (last == '[' && cur == ']');
//     }    
// }
class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n%2==1)return false;
        Stack <Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{')st.push(ch);
            else{
                if(st.size()==0)return false;
                char top=st.peek();
                if(sameStyle(top,ch))st.pop();
                else return false;
            }
        }
        return (st.size()==0);
    }
    static boolean sameStyle(char a,char b){
        if(a=='('&&b==')')return true;
        if(a=='['&&b==']')return true;
        if(a=='{'&&b=='}')return true;
        return false;
    }
}
