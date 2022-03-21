package com.Assem.Lap4;

import java.util.Scanner;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue<Integer>queue = new ArrayQueue<>(5);
        System.out.println("input queue elements");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            queue.enqueue(in.nextInt());
            System.out.println("first = " + queue.first());
            System.out.println("size = " + queue.size());
        }
        System.out.println("queue elements are ");
        while (!queue.isEmpty()){
            System.out.println(queue.dequeue() + "\t");
        }
    }
}
