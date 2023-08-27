package com.bean;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Queue;

public class CollectionsAsLifoQueue {

	public static void main(String[] args) {
		/*
		 * Collections.asLifoQueue() is used to wrap  a given Deque (Double Ended Queue)(LIFO and FIFO)
		 * into Last-in-First-Out (LIFO) implementation, also known as Stack.
		 * 
		 */
		Deque<String> deque=new ArrayDeque<>();
		deque.add("apple");
		deque.add("ball");
		deque.add("cat");
	Queue<String> lifoQueue=Collections.asLifoQueue(deque);
	System.out.println(lifoQueue);
}
}
