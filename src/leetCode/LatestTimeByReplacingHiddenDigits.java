package leetCode;

// https://leetcode.com/problems/latest-time-by-replacing-hidden-digits/description/

public class LatestTimeByReplacingHiddenDigits {
    public static void main(String[] args) {
        System.out.println("23:50 == " +
                LatestTimeByReplacingHiddenDigits.maximumTime("2?:?0"));
        System.out.println("09:39 == " +
                LatestTimeByReplacingHiddenDigits.maximumTime("0?:3?"));
        System.out.println("19:22 == " +
                LatestTimeByReplacingHiddenDigits.maximumTime("1?:22"));
    }

    public static String maximumTime(String time) {

        char[] ct = time.toCharArray();

        if(ct[0] == '?') {
            if(ct[1] != '?' && ct[1] > '3') {
                ct[0] = '1';
            } else {
                ct[0] = '2';
            }
        }

        if(ct[1] == '?') {
            if(ct[0] == '2') {
                ct[1] = '3';
            } else {
                ct[1] = '9';
            }
        }

        if(ct[3] == '?') {
            ct[3] = '5';
        }

        if(ct[4] == '?') {
            ct[4] = '9';
        }

        return new String(ct);
    }
}
