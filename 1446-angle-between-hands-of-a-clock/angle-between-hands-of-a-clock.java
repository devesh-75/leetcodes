class Solution {
    public double angleClock(int hour, int minutes) {
        double x = minutes * 6 ;
        double plus = x * (1/12.0);
        double hr = (hour*30) + plus;
        double ans =  Math.abs(x - hr);
        return Math.min(ans, 360 - ans);
    }
}