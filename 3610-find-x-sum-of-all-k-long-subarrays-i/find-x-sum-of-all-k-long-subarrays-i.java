class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
         int n = nums.length;
        int[] answer = new int[n - k + 1];
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Initialize first window
        for (int i = 0; i < k; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }

        answer[0] = calculateXSum(freqMap, x);

        // Slide the window
        for (int i = k; i < n; i++) {
            // Remove outgoing element
            int out = nums[i - k];
            if (freqMap.get(out) == 1) {
                freqMap.remove(out);
            } else {
                freqMap.put(out, freqMap.get(out) - 1);
            }

            // Add incoming element
            int in = nums[i];
            freqMap.put(in, freqMap.getOrDefault(in, 0) + 1);

            answer[i - k + 1] = calculateXSum(freqMap, x);
        }

        return answer;
    }

    private int calculateXSum(Map<Integer, Integer> map, int x) {
        List<int[]> elements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            elements.add(new int[]{entry.getValue(), entry.getKey()});
        }

        // Sort: Freq descending, then Value descending
        Collections.sort(elements, (a, b) -> {
            if (a[0] != b[0]) return b[0] - a[0];
            return b[1] - a[1];
        });

        int sum = 0;
        int count = 0;
        for (int[] p : elements) {
            if (count >= x) break;
            sum += p[0] * p[1];
            count++;
        }
        return sum;
    }
}