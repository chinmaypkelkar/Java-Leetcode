package Array;

import java.util.PriorityQueue;

public class FindKthLargest {
    public int getKthLargest(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] output = new int[k];
        for(int num : nums){
            pq.add(num);
            if(pq.size() > k){
                pq.poll();
            }

        }

        return pq.poll();


    }
}
