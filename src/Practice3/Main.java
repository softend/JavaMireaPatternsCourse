package Practice3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
//    Мой список
    static MyList list = new MyList();
//    Моя мапа
    static MyMap map = new MyMap();
    static Map<String, Integer> map2 = new HashMap();
    static List<Integer> newList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
//        Потоки, добавляем в цикле элементы
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                list.add(1);
                newList.add(1);
                map.put("key" + Math.random() + Math.random(), 0);
                map2.put("key" + Math.random() + Math.random(), 0);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                list.add(1);
                newList.add(1);
                map.put("key" + Math.random() + Math.random(), 0);
                map2.put("key" + Math.random() + Math.random(), 0);
            }
        });
//        Запускаем потоки
        thread1.start();
        thread2.start();
//        Ждем чтобы отработали
        Thread.sleep(1000);
//        Выводим размер всех
        System.out.println("Размер моего списка: " + list.size());
        System.out.println("Размер не моего списка: " + newList.size());
        System.out.println("Размер моей реализации map:"+map.size());
        System.out.println("Размер map по умолчанию:"+map2.size());
    }
}
