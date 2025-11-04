package leetCode;

// https://leetcode.com/problems/design-parking-system/description/

public class DesignParkingSystem {
    int[] spaces;

    public DesignParkingSystem(int big, int medium, int small) {
        spaces = new int[]{0, big, medium, small};
    }

    public boolean addCar(int carType) {
        if(spaces[carType] > 0) {
            spaces[carType]--;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        DesignParkingSystem obj = new DesignParkingSystem(1, 1, 0);
        System.out.println("[null, true, true, false, false] == [null, " +
                obj.addCar(1) + ", " +
                obj.addCar(2) + ", " +
                obj.addCar(3) + ", " +
                obj.addCar(1) + "] ");
    }
}
