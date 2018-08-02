package stack;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class LinkedListStacktest1 {


	Stack stack=new LinkedListStack();
	@Test
	public void isEmptyTest() {
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
