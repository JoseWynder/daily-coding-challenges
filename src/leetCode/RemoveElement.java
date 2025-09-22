package leetCode;

// https://leetcode.com/problems/remove-element/description/

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println("2 == " + RemoveElement.removeElement(new int[]{3,2,2,3}, 3));
        System.out.println("5 == " + RemoveElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public static int removeElement(int[] numbers, int value)  {

        int i = 0;
        int k = numbers.length;
        while(i < k) {
            if(numbers[i] != value) {
                i++;
            } else {
                numbers[i] = numbers[--k];
            }
        }

        return k;

//        int k = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] != value) {
//                numbers[k++] = numbers[i];
//            }
//        }
//        return k;
    }
}
