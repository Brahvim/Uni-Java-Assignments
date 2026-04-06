package com.brahvim.uni.sem4.labs.jcf;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

	public static void main(final String[] p_args) {
		final Queue<String> queue = new ArrayDeque<>();
		queue.add("Brahvim");
		
		System.out.println(queue.poll());
		
		System.out.println("Adding more names...");
		
		queue.add("Aman");
		queue.add("Ayush");
		queue.add("Prateek");
		queue.add("Brahvim");
		
		System.out.println(queue.peek());
		System.out.println(queue.size());
	}
	
}
