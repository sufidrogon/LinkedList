package examples;

import structure.LinkedList;
import type.Queue;

public class IntListInQueue implements Queue {

	private LinkedList list;

	public IntListInQueue() {
		list = new LinkedList();
	}

	@Override
	public void put(int value) {
		list.insertAtBeginning(value);

	}

	@Override
	public boolean remove() {
		return list.deleteAtEnd();
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
