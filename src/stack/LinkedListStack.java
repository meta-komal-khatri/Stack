package stack;

import java.util.NoSuchElementException;
/**
 * implements stack using linked list representation
 */
public class LinkedListStack implements Stack {
	protected Node top;
	public LinkedListStack(){
		top=null;
	}
	/**
	 * add elements at the top of linked list
	 * @param value added to the stack
	 */
	public void push(int valueOfStack){
		Node newNode=new Node(valueOfStack,null);
		if(top==null){
			top=newNode;
		}
		else{
			newNode.setLink(top);
			top=newNode;
		}
	}
	/**
	 * delete elements at the top of linked list
	 * @return deleted element
	 */
	public int pop(){
		Node pointer;
		int element;
		if(top==null){
			throw new NoSuchElementException("Underflow Exception");
		}
		else{
			pointer=top;
			top=pointer.getLink();
			element=pointer.getData();
		}
		return element;
	}
	/**
	 * checks that linked list stack is empty or not
	 * @return true if  stack linked list is empty 
	 */
	public boolean isEmpty(){
		return top==null;
	}
	
}
