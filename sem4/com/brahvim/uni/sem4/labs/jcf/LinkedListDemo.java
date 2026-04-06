package com.brahvim.uni.sem4.labs.jcf;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(final String[] p_args) {
		final LinkedList<Integer> nums = new LinkedList<>();
		
		// Add elements:
		nums.add(10);
		nums.add(20);
		nums.addFirst(5);
		nums.addLast(30);
		
		// *Peek* & *Poll* (Queue behaviors):
		System.out.println(nums.peek()); // `5`
		System.out.println(nums.poll()); // `5` printed and removed.
		
		// Stack behaviors:
		nums.push(99); // Same as `LinkedList::addFirst()`.
		nums.pop(); // Same as `LinkedList::removeFirst()`.
		
		System.out.println(nums); // `[ 10, 20, 30 ]`.
	}

}
