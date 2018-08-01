package queue;
import stack.Node;
public class LinkedListQueue {
	protected Node front;
	protected Node rear;
	LinkedListQueue(){
		front=null;
		rear=null;
	}
	/**
	 * add element into queue at rear
	 * @param element
	 */
	public void enqueue(int element) {
		Node newNode=new Node(element,null);
		if(front==null) {
			front=newNode;
			rear=newNode;
		}
		else {
			rear.setLink(newNode);
			rear=newNode;
		}
	}
	/**
	 * deletes element from queue at front
	 * @return deleted value
	 * @throws AssertionError when queue is empty
	 */
	public int dequeue() {
		Node pointer;
		int element;
		if(front==null) {
			throw new AssertionError("Underflow");
		}
		else {
			pointer=front;
			front=pointer.getLink();
			element=pointer.getData();
		}
		return element;
	}
	/**
	 * checks that queue is empty or not
	 * @return true if queue is empty
	 */
	public boolean isEmpty() {
		return front==null;
	}
}
