package leetCode;

public class DivisibleAndNonDivisibleSumsDifference {
    public static int differenceOfSums(int n, int m) {
        int total = n * (n + 1) / 2;
        if (m > n) return total;

        int k = n / m;
        int num2 = m * k * (k + 1) / 2;
        int num1 = total - num2;

        return num1 - num2;
    }

    public static void main(String[] args) {
        System.out.println("19 == " + differenceOfSums(10,3));
        System.out.println("15 == " + differenceOfSums(5,6));
        System.out.println("-15 == " + differenceOfSums(5,1));
    }
}
