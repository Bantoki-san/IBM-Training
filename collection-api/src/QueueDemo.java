import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {

		Queue<String> que = new LinkedList<>();

		que.offer("Apple");
		que.offer("banana");
		que.offer("Cherry");

		System.out.println(que.peek()); // Fetch Value but does not remove

		while (!que.isEmpty())
			System.out.println(que.poll()); // Fetch Value and remove from queue
		
	}
}
