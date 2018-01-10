package type;

public interface AdvancedList {

	void insertAtBeginning(int value);

	void insertAtEnd(int value);

	void insertAtKPosition(int value, int K);

	boolean deleteAtBeginning();

	boolean deleteAtEnd();

	boolean deleteAtKPosition(int K);

}