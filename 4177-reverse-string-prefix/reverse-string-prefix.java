class Solution {
    public String reversePrefix(String s, int k) {
        char arr[]=s.toCharArray();
        int j=k-1;
        for(int i=0;i<j;i++,j--){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        
        return new String(arr);
    }
}