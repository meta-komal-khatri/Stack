package stack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class LinkedListStackTest {

	Stack stack=new LinkedListStack();
	@Test
	void isEmptyTest() {
		assertEquals(true,stack.isEmpty());
	}
	@Test
	public void popTest() {
		try {
		stack.pop();
		stack.pop();
		assertNotEquals(true,stack.isEmpty());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		}
		catch(NoSuchElementException exception) {
			
		}
		assertEquals(true,stack.isEmpty());
		
	}

}
