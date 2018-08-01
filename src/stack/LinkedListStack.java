package stack;

import java.util.NoSuchElementException;

public class LinkedListStack {
	protected Node top;
	public LinkedListStack(){
		top=null;
	}
	public void push(int x){
		Node newNode=new Node(x,null);
		if(top==null){
			top=newNode;
		}
		else{
			newNode.setLink(top);
			top=newNode;
		}
	}
	public int pop(){
		Node ptr;
		int x;
		if(top==null){
			throw new NoSuchElementException("Underflow Exception");
		}
		else{
			ptr=top;
			top=ptr.getLink();
			x=ptr.getData();
		}
		return x;
	}
	public boolean isEmpty(){
		return top==null;
	}
}
