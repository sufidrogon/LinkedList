package testclasses;

import examples.IntListInStack;
import type.Stack;

public class IntListInStackTest {

	public static void main(String[] args) {
		Stack stack = new IntListInStack();
		stack.display();
		stack.put(5);
		stack.put(3);
		stack.put(2);
		stack.display();
		stack.put(8);
		stack.put(7);
		stack.display();
		
		stack.remove();
		stack.remove();
		stack.remove();
		stack.display();
		stack.remove();
		stack.remove();
		stack.display();
	}

}
