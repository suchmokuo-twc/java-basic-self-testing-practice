package com.twc.javaBasic;

@SuppressWarnings({ "unused", "FieldCanBeLocal" })
public class MyStack {
    private int[] storage;
    private int capacity;
    private int count;
    private static final int GROW_FACTOR = 2;

    public MyStack(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("Capacity too small.");
        }

        capacity = initialCapacity;
        storage = new int[initialCapacity];
        count = 0;
    }

    public void push(int value) {
        if (count == capacity) {
            ensureCapacity();
        }

        storage[count++] = value;
    }

    private void ensureCapacity() {
        int newCapacity = capacity * GROW_FACTOR;

        int[] newStorage = new int[newCapacity];

        for (int i = 0; i < capacity; i++) {
            newStorage[i] = storage[i];
        }

        capacity = newCapacity;
        storage = newStorage;
    }

    public int[] popToArray() {
        final int totalItemsCount = count;
        int[] array = new int[totalItemsCount];

        while (count > 0) {
            array[totalItemsCount - count] = pop();
        }

        return array;
    }

    private int pop() {
        if (count == 0) {
            throw new UnsupportedOperationException("Stack is empty.");
        }

        int value = storage[--count];
        return value;
    }
}
