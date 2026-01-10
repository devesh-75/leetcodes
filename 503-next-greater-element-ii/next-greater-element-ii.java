class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n];
            while (!s.isEmpty() && s.peek() <= nums[i % n]) {
                s.pop();
            }
            if (i < n) {
                if (s.isEmpty()) {
                    nums[i] = -1; 
                }
                else{
                    nums[i] = s.peek(); 
                }
            }
            s.push(curr);
        }
        return nums;
    }
}
