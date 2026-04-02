import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	
	public static void main(String[] p_args) {
		Deque<String> dequeue = new ArrayDeque<>();
		
		dequeue.offerLast("A");
		dequeue.offerLast("B");
		dequeue.offerLast("C");
		System.out.println(dequeue.pollFirst());
		
		dequeue.push("X");
		dequeue.push("Y"); // Essentially `Deque::addFirst()`.
		System.out.println(dequeue.pop());
		System.out.println(dequeue.peek());
		
		System.out.println(dequeue);
	}

}
