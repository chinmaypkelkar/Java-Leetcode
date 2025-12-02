package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int stoneweight : stones){
            pq.add(stoneweight);
        }

        int remaining = -1;
        while(!pq.isEmpty()){
            int highest = pq.poll();
            if(pq.isEmpty()){
               remaining = highest;
               break;
            }else{
                int secondHighest = pq.poll();
                remaining = highest - secondHighest;
                pq.add(remaining);
            }
        }

        return remaining;
    }
}
