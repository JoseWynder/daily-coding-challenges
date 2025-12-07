package leetCode;

// https://leetcode.com/problems/restore-finishing-order/description/

import java.util.Arrays;

public class RestoreFinishingOrder {
    public static int[] recoverOrder(int[] order, int[] friends) {
        boolean[] isFriend = new boolean[order.length + 1];
        for (int friend : friends) {
            isFriend[friend] = true;
        }

        int[] finishingOrder = new int[friends.length];
        int position = 0;

        for (int i = 0; i < order.length && position < friends.length; i++) {
            int participantId = order[i];
            if (isFriend[participantId]) {
                finishingOrder[position] = participantId;
                position++;
            }
        }

        return finishingOrder;
    }

    public static void main(String[] args) {
        System.out.println("[3, 1, 4] == "
                + Arrays.toString(recoverOrder(new int[]{3,1,2,5,4}, new int[]{1,3,4})));
        System.out.println("[5, 2] == "
                + Arrays.toString(recoverOrder(new int[]{1,4,5,3,2}, new int[]{2,5})));
    }
}
