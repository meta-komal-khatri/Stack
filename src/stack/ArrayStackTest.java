package stack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class ArrayStackTest {
	Stack stack=new ArrayStack(5);
	@Test
	void isEmptyTest() {
		assertEquals(true,stack.isEmpty());
	}
	
	@Test 
	public void pushTest() {
		stack.push(3);
		stack.push(4);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		assertArrayEquals(new int[] {3,4,6,7,8},ArrayStack.arrayStack);
		try {
			stack.push(3);
		}
		catch(IndexOutOfBoundsException exception) {
			
		}
	}
	@Test
	public void popTest() {
		try {
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		}
		catch(NoSuchElementException exception) {
			
		}
	}

}
