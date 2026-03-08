class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int sum = 0;
        Collections.sort(processorTime);
        Collections.sort(tasks);
        int j = 0;
        for(int i=tasks.size()-1; i>=3 && j<processorTime.size(); i=i-4)
        {
            int p1 = processorTime.get(j) + tasks.get(i);
            int p2 = processorTime.get(j) + tasks.get(i-1);
            int p3 = processorTime.get(j) + tasks.get(i-2);
            int p4 = processorTime.get(j) + tasks.get(i-3);
            int max1 = Math.max(p1,p2);
            int max2 = Math.max(p3,p4);
            int max = Math.max(max1,max2);
            sum = Math.max(sum, max);
            j++;       
        }
        return sum;
    }
}