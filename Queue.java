package com.Assem.Lap4;

public interface Queue <E> {
    boolean isEmpty();
    int size();
    void enqueue (E element);
    E dequeue();
    E first();
}
