package homework.lesson9.arraylist;
import java.util.Collection;

public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity не может быть отрицательным");
        }

        elements = new Object[capacity];
    }

    public MyArrayList(MyList<? extends T> col) {
        this(col.size());

        for (int i = 0; i < col.size(); i++) {
            add(col.get(i));
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value) != -1;
    }

    @Override
    public boolean add(T value) {
        ensureCapacity();

        elements[size] = value;
        size++;

        return true;
    }

    @Override
    public boolean add(int index, T value) {
        checkPositionForAdd(index);
        ensureCapacity();

        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        elements[index] = value;
        size++;

        return true;
    }

    @Override
    public boolean remove(Object value) {
        int index = indexOf(value);

        if (index == -1) {
            return false;
        }

        remove(index);
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> value) {
        if (value == null) {
            throw new NullPointerException("Collection не может быть null");
        }

        if (value.isEmpty()) {
            return false;
        }

        ensureCapacity(size + value.size());

        for (T element : value) {
            elements[size] = element;
            size++;
        }

        return true;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);

        return (T) elements[index];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        checkIndex(index);

        T removedElement = (T) elements[index];

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null;
        size--;

        return removedElement;
    }

    @Override
    public T set(int index, T value) {
        checkIndex(index);

        @SuppressWarnings("unchecked")
        T oldValue = (T) elements[index];

        elements[index] = value;

        return oldValue;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < size; i++) {
            if (value == null) {
                if (elements[i] == null) {
                    return i;
                }
            } else if (value.equals(elements[i])) {
                return i;
            }
        }

        return -1;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity;

            if (elements.length == 0) {
                newCapacity = 1;
            } else {
                newCapacity = elements.length * 2;
            }

            Object[] newElements = new Object[newCapacity];

            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }

            elements = newElements;
        }
    }

    private void ensureCapacity(int requiredCapacity) {
        if (requiredCapacity <= elements.length) {
            return;
        }

        int newCapacity;

        if (elements.length == 0) {
            newCapacity = 1;
        } else {
            newCapacity = elements.length * 2;
        }

        while (newCapacity < requiredCapacity) {
            newCapacity *= 2;
        }

        Object[] newElements = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }

        elements = newElements;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Индекс: " + index + ", размер: " + size
            );
        }
    }

    private void checkPositionForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                    "Индекс: " + index + ", размер: " + size
            );
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");


        for (int i = 0; i < size; i++) {
            result.append(elements[i]);

            if (i < size - 1) {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }
}