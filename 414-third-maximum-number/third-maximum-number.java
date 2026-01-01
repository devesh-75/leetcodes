class Solution {
    public int thirdMax(int[] nums) {
        Long m1 = null, m2 = null, m3 = null;

        for (int i = 0; i < nums.length; i++) {

            if ((m1 != null && nums[i] == m1) ||
                (m2 != null && nums[i] == m2) ||
                (m3 != null && nums[i] == m3))
                continue;

            if (m1 == null || nums[i] > m1) {
                m3 = m2;
                m2 = m1;
                m1 = (long) nums[i];
            }
            else if (m2 == null || nums[i] > m2) {
                m3 = m2;
                m2 = (long) nums[i];
            }
            else if (m3 == null || nums[i] > m3) {
                m3 = (long) nums[i];
            }
        }

        return (m3 == null) ? m1.intValue() : m3.intValue();
    }
}
