class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int left[]=new int [n];
        int right[]=new int [n];
       for (int i = 0; i < n; i++) {
        while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
            st.pop();
        }

        left[i] = st.isEmpty() ? -1 : st.peek();
        st.push(i);
    }

    st.clear();

    // Nearest smaller element on the right
    for (int i = n - 1; i >= 0; i--) {
        while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
            st.pop();
        }

        right[i] = st.isEmpty() ? n : st.peek();
        st.push(i);
    }

    int maxArea = 0;

    for (int i = 0; i < n; i++) {
        int width = right[i] - left[i] - 1;
        int area = width * arr[i];

        maxArea = Math.max(maxArea, area);
    }

    return maxArea;
    }
}