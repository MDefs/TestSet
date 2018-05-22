import java.util.Collections;
import java.util.HashMap;

public class MySet<T> implements LimitedSet<T>{

    private HashMap<T, Integer> map = new HashMap<>();
    private Object min_contains;


    @Override
    public void add(T o) {
        if (map.size() == 10) {
            map.remove(min_contains);
        }
        map.put(o, 0);
        min_contains = o;
    }

    @Override
    public boolean remove(T o) {
        if (map.containsKey(o)) {
            map.remove(o);
            System.out.println("Element " + o + " was removed!");
        } else {
            System.out.println("Element does not exists!");
        }
        return false;
    }

    @Override
    public boolean contains(T o) {
        if (map.containsKey(o)) {
            System.out.println(o + " is existing!");
            map.put(o, map.get(o)+1);
            min_contains = Collections.min(map.entrySet(), HashMap.Entry.comparingByValue()).getKey();
        } else {
            System.out.println("Element does not exists!");
        }
        return false;
    }

    public void show() {
        for (HashMap.Entry entry: map.entrySet())
            System.out.println(entry.getKey());
    }
}
