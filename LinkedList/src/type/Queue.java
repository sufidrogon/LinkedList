package type;

public interface Queue {

	void put(int value);

	boolean remove();

	int getSize();

	boolean isEmpty();

	void display();

}