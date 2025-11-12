package neetCode;

// https://neetcode.io/problems/design-hashmap?list=neetcode250

public class DesignHashMap {
    private LinkedList[] map;

    public DesignHashMap() {
        map = new LinkedList[1000];
        for (int i = 0; i < 1000; i++) {
            map[i] =  new LinkedList();
        }
    }

    private int hash(int key) {
        return key % map.length;
    }

    public void put(int key, int value) {
        LinkedList cur = map[hash(key)];
        while (cur.next != null) {
            if (cur.next.key == key) {
                cur.next.value = value;
                return;
            }
            cur = cur.next;
        }
        cur.next = new LinkedList(key, value, null);
    }

    public int get(int key) {
        LinkedList cur = map[hash(key)].next;
        while (cur != null) {
            if (cur.key == key) {
                return cur.value;
            }
            cur = cur.next;
        }
        return -1;
    }

    public void remove(int key) {
        LinkedList cur = map[hash(key)];
        while (cur.next != null) {
            if (cur.next.key == key) {
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }

    public class LinkedList {
        int key;
        int value;
        LinkedList next;

        public LinkedList(int key, int value, LinkedList next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public LinkedList() {
            this(-1, -1, null);
        }
    }

    public static void main(String[] args) {
        DesignHashMap designHashMap = new DesignHashMap();
        designHashMap.put(1, 1);
        designHashMap.put(2, 2);
        System.out.println("1 == " + designHashMap.get(1));
        System.out.println("-1 == " + designHashMap.get(3));
        designHashMap.put(2, 1);
        System.out.println("1 == " + designHashMap.get(2));
        designHashMap.remove(2);
        System.out.println("-1 == " + designHashMap.get(2));
    }
}
