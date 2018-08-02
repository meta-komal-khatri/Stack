package queue;

public interface Queue {
	void enqueue(int element);
	int dequeue();
	boolean isEmpty();
}
