package Practice1;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Создаем компаратор и реализуем его функцию compare с помощью лямбда-выражения, она сравнивает размер двух списков
        //Тип данных компаратора - Список с любыми элементами
        Comparator<ArrayList<?>> comparator = (a, b) -> Integer.compare(a.size(), b.size());

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("asd");
        //Создаем 2 списка и тестируем вывод
        System.out.println(comparator.compare(list1,list2));
    }
}