package Practice3;

import java.util.Map;

public class Main {
    static MyList list = new MyList();
    static MyMap map = new MyMap();

    public static void main(String[] args) throws InterruptedException {
        list.add(0);
        map.put("key", 0);
        Thread thread1 = new Thread(() -> {
            increment();
            mapincrement();
        });
        Thread thread2 = new Thread(() -> {
            increment();
            mapincrement();
        });
        thread1.start();
        thread2.start();
        Thread.sleep(1000);
        System.out.println(list.get(0));
        System.out.println(map.get("key"));
    }

    static void increment() {
        for (int i = 0; i < 100; i++) {
            list.set(0, (int) list.get(0) + 1);
        }
    }
    static void mapincrement() {
        for (int i = 0; i < 100; i++) {
            int a = (int)map.get("key");
            a++;
            map.clear();
            map.put("key", a);
        }
    }
}
