package Practice3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap implements Map<Object, Object> {

    private Map<Object, Object> map = new HashMap<>();

    @Override
    public synchronized int size() {
        return map.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public synchronized boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public synchronized boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public synchronized Object get(Object key) {
        return map.get(key);
    }

    @Override
    public synchronized Object put(Object key, Object value) {
        return map.put(key,value);
    }

    @Override
    public synchronized Object remove(Object key) {
        return map.remove(key);
    }

    @Override
    public synchronized void putAll(Map<?, ?> m) {
        map.putAll(m);
    }

    @Override
    public synchronized void clear() {
        map.clear();
    }

    @Override
    public synchronized Set<Object> keySet() {
        return map.keySet();
    }

    @Override
    public synchronized Collection<Object> values() {
        return map.values();
    }

    @Override
    public synchronized Set<Entry<Object, Object>> entrySet() {
        return map.entrySet();
    }
}
