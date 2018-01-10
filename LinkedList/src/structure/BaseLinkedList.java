package structure;

import data.ListNode;
import type.BaseList;

public class BaseLinkedList implements BaseList {

	protected ListNode head;

	protected int size = 0;

	public BaseLinkedList() {
		head = null;
	}

	@Override
	public void insert(int value) {
		size++;
		if (head == null) {
			head = new ListNode(value);
			return;
		}

		ListNode temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(new ListNode(value));
	}

	@Override
	public boolean delete(int value) {
		ListNode temp = head;
		size--;
		if (temp.getValue() == value) {
			head = head.getNext();
			return true;
		}

		while (temp.getNext() != null) {
			if (temp.getNext().getValue() == value) {
				ListNode skip = temp.getNext().getNext();
				temp.setNext(skip);
				return true;
			}
			temp = temp.getNext();
		}

		size++;
		return false;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public void display() {
		ListNode temp = head;
		System.out.print("List elements : [");
		while (temp != null) {
			System.out.print(temp.getValue() + " ");
			temp = temp.getNext();
		}
		System.out.println("]\tSize : " + getSize());
	}

}
