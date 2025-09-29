package leetCode;

// https://leetcode.com/problems/convert-the-temperature/description/

import java.util.Arrays;

public class ConvertTheTemperature {
    public static void main(String[] args) {
        System.out.println("[309.65, 97.7] == " +
                Arrays.toString(ConvertTheTemperature.convertTemperature(36.50)));
        System.out.println("[395.26, 251.798] == " +
                Arrays.toString(ConvertTheTemperature.convertTemperature(122.11)));
    }

    // 😒
    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32;
        return new double[]{kelvin, fahrenheit};
    }
}
