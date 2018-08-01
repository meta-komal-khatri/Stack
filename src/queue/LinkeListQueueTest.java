package queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkeListQueueTest {
	LinkedListQueue linkedListQueue=new LinkedListQueue();
	@Test
	void queueUnderflowTest() {
		assertEquals(true,linkedListQueue.isEmpty());
		assertNotEquals(false,linkedListQueue.isEmpty());
	}
	
	@Test
	public void Test() {
		linkedListQueue.enqueue(4);
		linkedListQueue.enqueue(3);
		linkedListQueue.enqueue(6);
		assertEquals(4,linkedListQueue.dequeue());
		linkedListQueue.enqueue(7);
		linkedListQueue.enqueue(6);
		linkedListQueue.enqueue(9);
		assertEquals(3,linkedListQueue.dequeue());
		assertEquals(6,linkedListQueue.dequeue());
		assertEquals(7,linkedListQueue.dequeue());
		assertNotEquals(1,linkedListQueue.dequeue());
		assertEquals(9,linkedListQueue.dequeue());
		//throws AssertionError when queue is empty
		try {
			linkedListQueue.dequeue();
		}
		catch(AssertionError error){
			assertEquals("Underflow",error.getMessage());
		}
			
		
	}
}
