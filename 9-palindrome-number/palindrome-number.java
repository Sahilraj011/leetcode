// class Solution {
//     public boolean isPalindrome(int x) {
//         ArrayList <Integer> al=new ArrayList<>();
//         int i=0;
//         int j=al.size()-1;
//         while(i<=j){
//             if(i==j)return true;
//             else if(al.get(i)
//             !=al.get(j))return true;
//             i++;
//             j--;
//         }
//          if(i==j)return true;
//         return false;
//     }
// }
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int xcopy = x;

        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }

        return reverse == xcopy;        
    }
}