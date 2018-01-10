package testclasses;

import examples.IntListInStack;
import structure.LinkedList;

public class BaseLinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.display();

		list.insert(5);
		list.insert(3);
		list.insert(6);

		list.display();

		list.insert(1);
		list.insert(7);
		list.display();

		list.delete(1);

		list.display();

		list.delete(7);
		list.delete(3);
		list.delete(5);
		list.display();

		list.delete(6);
		list.display();

	}

}
