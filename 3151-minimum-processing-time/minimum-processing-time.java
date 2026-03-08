class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int sum = 0;
        Collections.sort(processorTime);
        Collections.sort(tasks);
        int j = 0;
        for(int i=tasks.size()-1; i>=3 && j<processorTime.size(); i=i-4)
        {
            sum = Math.max(sum, processorTime.get(j) + tasks.get(i));
            j++;
        }
        return sum;
    }
}