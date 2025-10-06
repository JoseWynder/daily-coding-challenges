package neetCode;

// https://neetcode.io/problems/kth-largest-integer-in-a-stream?list=neetcode150

import java.util.PriorityQueue;

public class KthLargestElementInAStream {
    PriorityQueue<Integer> minHeap;
    int k;

    public KthLargestElementInAStream(int k, int[] nums) {
        minHeap = new PriorityQueue<>();
        this.k = k;

        for (int num : nums) {
            minHeap.offer(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }

    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargestElementInAStream kthLargest = new KthLargestElementInAStream(
                3, new int[]{1, 2, 3, 3});

        System.out.println("3 == " + kthLargest.add(3));
        System.out.println("3 == " + kthLargest.add(5));
        System.out.println("3 == " + kthLargest.add(6));
        System.out.println("5 == " + kthLargest.add(7));
        System.out.println("6 == " + kthLargest.add(8));

        kthLargest = new KthLargestElementInAStream(
                3, new int[]{4, 5, 8, 2});

        System.out.println("\n4 == " + kthLargest.add(3));
        System.out.println("5 == " + kthLargest.add(5));
        System.out.println("5 == " + kthLargest.add(10));
        System.out.println("8 == " + kthLargest.add(9));
        System.out.println("8 == " + kthLargest.add(4));
    }
}
