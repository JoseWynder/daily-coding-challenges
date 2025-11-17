package neetCode;

// https://neetcode.io/problems/merge-sorted-array?list=neetcode250

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[last--] = nums1[i--];
            } else {
                nums1[last--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{10,20,30,40,0,0};
        int[] nums2 = new int[]{1,2};
        merge(nums1, 4, nums2, nums2.length);
        System.out.println("[1, 2, 10, 20, 20, 40] == " + Arrays.toString(nums1));

        nums1 = new int[]{0,0};
        nums2 = new int[]{1,2};
        merge(nums1, 0, nums2, nums2.length);
        System.out.println("[1, 2] == " + Arrays.toString(nums1));
    }
}
