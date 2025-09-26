package neetCode;

// https://neetcode.io/problems/last-stone-weight

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        System.out.println("0 == " + LastStoneWeight.lastStoneWeight(new int[]{}));
        System.out.println("1 == " + LastStoneWeight.lastStoneWeight(new int[]{1}));
        System.out.println("1 == " + LastStoneWeight.lastStoneWeight(new int[]{1,2}));
        System.out.println("1 == " + LastStoneWeight.lastStoneWeight(new int[]{2,3,6,2,4}));
    }

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        while(maxHeap.size() > 1) {
            int first = maxHeap.poll();
            int second = maxHeap.poll();
            if(first != second) {
                maxHeap.add(first - second);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
