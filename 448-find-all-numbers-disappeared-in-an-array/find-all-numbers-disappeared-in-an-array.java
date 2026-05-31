class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correctIdx = nums[i]-1;
            if (nums[i] != nums[correctIdx]) {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                result.add(j + 1);
            }
        }
        
        return result;
    }
}