class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] nums = new int[1001];

        for (int n : arr1) nums[n]++;

        int count = 0;

        for (int n : arr2) {
            while (nums[n]-- > 0) {
                arr1[count++] = n;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            while (nums[i]-- > 0) {
                arr1[count++] = i;
            }
        }

        return arr1;
    }
}
