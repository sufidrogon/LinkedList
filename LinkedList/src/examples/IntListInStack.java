package examples;

import structure.LinkedList;
import type.Stack;

public class IntListInStack implements Stack {

	private LinkedList list;

	public IntListInStack() {
		list = new LinkedList();
	}

	@Override
	public void put(int value) {
		list.insertAtBeginning(value);

	}
	
	@Override
	public boolean remove() {
		return list.deleteAtBeginning();
	}

	@Override
	public int getSize() {
		return list.getSize();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void display() {
		list.display();
	}

}
