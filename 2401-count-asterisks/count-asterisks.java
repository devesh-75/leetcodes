class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean in = false;

        for (char ch : s.toCharArray()) {
            if (ch == '|') {
                in = !in;
            } else if (ch == '*' && !in) {
                count++;
            }
        }
        return count;
    }
}