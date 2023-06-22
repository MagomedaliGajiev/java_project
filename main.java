import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        // Map<Integer, String> db = new HashMap<>();
        // db.putIfAbsent(1, "one");
        // System.out.println(db);
        // db.put(2, "two");
        // System.out.println(db);
        // db.put(3, "three");
        // System.out.println(db);
        // db.put(31, "three one");
        // System.out.println(db);
        // db.put(13, "one three");
        // System.out.println(db);
        // db.put(null, "!null");
        // System.out.println(db);
        // db.put(null, null);
        // System.out.println(db);
        // System.out.println(db.containsValue("one"));
        // System.out.println(db.containsValue(1));
        // System.out.println(db.containsKey(69));
        // System.out.println(db.keySet());
        // System.out.println(db.values());
        // System.out.println(db.get(31));
        // db.remove(13);
        // System.out.println(db);

        // for (var item : db.entrySet()) {
        // System.out.printf("%d: %s", item.getKey(), item.getValue());
        // }

        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "one");
        tMap.put(2, "Fuck you");
        tMap.put(3, "bitch");
        System.out.println(tMap);

        System.out.println(tMap.descendingKeySet());
        System.out.println(tMap.descendingMap());
        System.out.println(tMap.tailMap(1));
        System.out.println(tMap.headMap(3));
        System.out.println(tMap.lastEntry());
    }
}
