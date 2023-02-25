package com.designPatterns.BehavioralPatterns.IteratorPattern;

public class ArrayCollection implements Collection{
    private final int MAX_SIZE = 10;
    private int size;
    private Object[] dataList;

    private class ArrayIterator implements Iterator {
        private final Object[] list;
        private int current;

        public ArrayIterator(Object[] list) {
            this.list = list;
            this.current = 0;
        }

        @Override
        public boolean hasNext() {
            return this.current < MAX_SIZE && list[this.current] != null;
        }

        @Override
        public Object next() {
            return list[current++];
        }
    }

    public ArrayCollection() {
        dataList = new Object[MAX_SIZE];
        size = 0;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(this.dataList);
    }

    @Override
    public void addItem(Object item) {
        if(size < MAX_SIZE)
        {
            dataList[size] = item;
            size++;
        } else {
            System.out.println("The Array is full");
        }
    }

    @Override
    public void removeItem() {
        if(size > 0) {
            dataList[size - 1] = null;
        }
    }
}
