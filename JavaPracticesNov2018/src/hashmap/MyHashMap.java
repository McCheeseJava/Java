package hashmap;
import java.util.*;
public class MyHashMap<K, V> {
    private HashMap<K, V> m = new HashMap<>();

    MyHashMap(K k, V v) {
        addPair(k, v);
    }

    MyHashMap() {
    }

    private void addPair(K k, V v) {
        m.put(k, v);
    }

    public V getValues(Character k) {
        return m.get(k);
    }

    public Set<Map.Entry<K, V>> getKeys() {
        Set keys = m.entrySet();
        return keys;
    }

    public boolean contains(K k) {
        return m.containsKey(k);
    }

    public boolean isEmpty() {
        return m.isEmpty();
    }

    public int size() {
        return m.size();
    }

    public static void main(String[] args) {
        MyHashMap<Character, Integer> o = new MyHashMap<>(' ', null);
        String s = "ttuuvvvxxx";
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (o.contains(s.charAt(i))) {
                a = o.getValues(s.charAt(i));
                o.addPair(s.charAt(i), a + 1);
            } else {
                o.addPair(s.charAt(i), 1);
            }

        }

        System.out.println("is map empty? " + o.isEmpty() + " Size: " + o.size());

        Set set = o.getKeys();
        Iterator i = set.iterator(); 
        while (i.hasNext()) {
            Map.Entry mentry = (Map.Entry) i.next();
            System.out.println("Key is: " + mentry.getKey() + " Value is: " + mentry.getValue());
        }

    }

}
