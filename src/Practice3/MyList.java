package Practice3;

import java.util.*;
import java.util.concurrent.Semaphore;

//ОБЪЯСНЕНИЕ: каждый метод исходного ArrayList обертываем в semaphore, то есть когда поток доходит, он запрашивает разрешение, а разрешений только одно


public class MyList implements List {
    private Semaphore semaphore = new Semaphore(1);
    private ArrayList<Object> list = new ArrayList<>();
    @Override
    public int size() {
        int size;
        try {
            semaphore.acquire();
            size = list.size();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean is;
        try {
            semaphore.acquire();
            is = list.isEmpty();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return is;
    }

    @Override
    public boolean contains(Object o) {
        boolean c;
        try {
            semaphore.acquire();
            c = list.contains(o);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return c;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator;
        try {
            semaphore.acquire();
            iterator = list.iterator();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] objects;
        try {
            semaphore.acquire();
            objects = list.toArray();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return objects;
    }

    @Override
    public boolean add(Object o) {
        boolean b;
        try {
            semaphore.acquire();
            b = list.add(o);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return b;
    }

    @Override
    public boolean remove(Object o) {
        boolean b;
        try {
            semaphore.acquire();
            b = list.add(o);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return b;
    }

    @Override
    public boolean addAll(Collection c) {
        boolean b;
        try {
            semaphore.acquire();
            b = list.addAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return b;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        boolean b;
        try {
            semaphore.acquire();
            b = list.addAll(index, c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return b;
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            list.clear();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
    }

    @Override
    public Object get(int index) {
        Object o;
        try {
            semaphore.acquire();
            o = list.get(index);
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return o;
    }

    @Override
    public Object set(int index, Object element) {
        Object o;
        try {
            semaphore.acquire();
            o = list.set(index, element);
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return o;
    }

    @Override
    public void add(int index, Object element) {
//        try {
//            semaphore.acquire();
            list.add(index, element);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        semaphore.release();
    }

    @Override
    public Object remove(int index) {
        Object o;
        try {
            semaphore.acquire();
            o = list.remove(index);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return o;
    }

    @Override
    public int indexOf(Object o) {
        int b;
        try {
            semaphore.acquire();
            b = list.indexOf(o);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return b;
    }

    @Override
    public int lastIndexOf(Object o) {
        int b;
        try {
            semaphore.acquire();
            b = list.lastIndexOf(o);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return b;
    }

    @Override
    public ListIterator listIterator() {
        ListIterator b;
        try {
            semaphore.acquire();
            b = list.listIterator();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return b;
    }

    @Override
    public ListIterator listIterator(int index) {
        ListIterator b;
        try {
            semaphore.acquire();
            b = list.listIterator(index);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return b;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        List b;
        try {
            semaphore.acquire();
            b = list.subList(fromIndex, toIndex);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return b;
    }

    @Override
    public boolean retainAll(Collection c) {
        boolean b;
        try {
            semaphore.acquire();
            b = list.retainAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return b;
    }

    @Override
    public boolean removeAll(Collection c) {
        boolean b;
        try {
            semaphore.acquire();
            b = list.removeAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return b;
    }

    @Override
    public boolean containsAll(Collection c) {
        boolean b;
        try {
            semaphore.acquire();
            b = list.containsAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return b;
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] b;
        try {
            semaphore.acquire();
            b = list.toArray(a);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        return b;
    }
}
