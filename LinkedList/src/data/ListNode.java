package data;

public class ListNode {
	private int value;
	private ListNode next;

	public ListNode(int value) {
		this.value = value;
		next = null;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int Value) {
		this.value = Value;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	
}
