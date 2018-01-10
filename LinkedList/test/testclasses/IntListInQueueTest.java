package testclasses;

import examples.IntListInQueue;
import type.Queue;

public class IntListInQueueTest {

	public static void main(String[] args) {
		Queue Queue = new IntListInQueue();
		Queue.display();
		
		Queue.put(5);
		Queue.display();
		Queue.put(3);
		Queue.display();
		Queue.put(2);
		Queue.display();
		Queue.put(8);
		Queue.display();
		Queue.put(7);

		Queue.display();
		
		Queue.remove();
		Queue.display();
		Queue.remove();
		Queue.display();
		Queue.remove();
		Queue.display();
		Queue.remove();
		Queue.display();
		Queue.remove();
		
		Queue.display();
	}

}
