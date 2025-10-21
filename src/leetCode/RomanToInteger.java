package leetCode;

// https://leetcode.com/problems/roman-to-integer/description/

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println("3 == " + romanToInt("III"));
        System.out.println("58 == " + romanToInt("LVIII"));
        System.out.println("1994 == " + romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int[] values = new int[90];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;

        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = values[s.charAt(i)];
            if(sum < value * 3) {
                sum += value;
            } else {
                sum -= value;
            }
        }

        return sum;
    }
}
