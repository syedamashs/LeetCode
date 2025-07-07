class Solution 
{
    public int maxEvents(int[][] events) 
    {
        // Step 1: Sort events by start day
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Min-heap for event end days
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); 
        
        int i = 0;
        int count = 0;
        int n = events.length;

        // Step 3: Find the last day to simulate
        int lastDay = 0;
        for (int[] e : events) 
        {
            lastDay = Math.max(lastDay, e[1]);
        }

        // Step 4: Simulate each day
        for (int day = 1; day <= lastDay; day++) 
        {
            // Step 4.1: Add all events starting today
            while (i < n && events[i][0] == day) 
            {
                minHeap.offer(events[i][1]);
                i++;
            }

            // Step 4.2: Remove expired events
            while (!minHeap.isEmpty() && minHeap.peek() < day) 
            {
                minHeap.poll();
            }

            // Step 4.3: Attend the event with earliest end
            if (!minHeap.isEmpty()) 
            {
                minHeap.poll();
                count++;
            }

            // Step 5: Break early if done
            if (i == n && minHeap.isEmpty())
            {
                break;
            } 
        }

        // Step 6: Return total attended events
        return count;
    }
}
