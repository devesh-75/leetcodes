class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int cur = asteroids[i];

            if (cur > 0) {
                s.push(cur);
            } else {
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < -cur) {
                    s.pop();
                }

                if (!s.isEmpty() && s.peek() == -cur) {
                    s.pop();                
                } else if (s.isEmpty() || s.peek() < 0) {
                    s.push(cur);            
                }
            }
        }
        int[] ans = new int[s.size()];
        for (int i = s.size() - 1; i >= 0; i--) {
            ans[i] = s.pop();
        }
        return ans;
    }
}
