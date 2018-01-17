package structure;

import data.ListNode;
import type.AdvancedFeatures;

public class LinkedList extends BaseLinkedList implements AdvancedFeatures {

	public LinkedList() {
	}

	@Override
	public void insertAtBeginning(int value) {

		if (size == 0) {
			head = new ListNode(value);
		} else {
			ListNode temp = new ListNode(value);
			temp.setNext(head);
			head = temp;
		}
		size++;
	}

	@Override
	public void insertAtEnd(int value) {
		super.insert(value);
	}

	@Override
	public void insertAtKPosition(int value, int K) {

	}

	@Override
	public boolean deleteAtBeginning() {
		if (size == 0) {
			return false;
		} else {
			size--;
			head = head.getNext();
			return true;
		}
	}

	@Override
	public boolean deleteAtEnd() {
		if (size == 0) {
			return false;
		} else if (size == 1) {
			head = null;
			size--;
			return true;
		}

		ListNode temp = head;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null);
		size--;
		return true;

	}

	@Override
	public boolean deleteAtKPosition(int K) {
		return false;

	}

}
