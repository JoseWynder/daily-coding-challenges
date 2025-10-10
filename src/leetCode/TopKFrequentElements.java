package leetCode;

// https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {
    public static void main(String[] args) {
        System.out.println("[1, 2] == " +
                Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,3}, 2)));
        System.out.println("[1] == " +
                Arrays.toString(topKFrequent(new int[]{1}, 1)));
        System.out.println("[1, 2] == " +
                Arrays.toString(topKFrequent(new int[]{1,2,1,2,1,2,3,1,3,2}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : frequency.keySet()) {
            int count = frequency.get(key);
            if(buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(key);
        }

        int[] result = new int[k];
        int pos = 0;
        for (int i = buckets.length - 1; i >= 0 && pos < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[pos++] = num;
                    if (pos == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
