package neetCode;

// https://neetcode.io/problems/design-hashset?list=neetcode250

public class DesignHashSet {
    private static boolean[] keys;

    public DesignHashSet() {
        keys = new boolean[1_000_001];
    }

    public void add(int key) {
        keys[key] = true;
    }

    public void remove(int key) {
        keys[key] = false;
    }

    public boolean contains(int key) {
        return keys[key];
    }

    public static void main(String[] args) {
        DesignHashSet hashSet = new DesignHashSet();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println("true == " + hashSet.contains(1));
        System.out.println("false == " + hashSet.contains(3));
        hashSet.add(2);
        System.out.println("true == " + hashSet.contains(2));
        hashSet.remove(2);
        System.out.println("false == " + hashSet.contains(2));

    }
}
