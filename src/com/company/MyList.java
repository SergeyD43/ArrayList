package com.company;

public class MyList<T> {
    private Object[] array = new Object[10];
    private int size = 0;

    public int size() {
        return size;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void add(T item) {
        if(size == array.length-1)
            resize(array.length*3/2 + 1);
        array[size++] = item;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
