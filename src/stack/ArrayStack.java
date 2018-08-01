package stack;

import java.util.NoSuchElementException;

public class ArrayStack {
	private int[] data;
	private int top,size;
	public ArrayStack(int n){
		size=n;
		data=new int[size];
		top=-1;
	}
	public void push(int x){
		if(top+1>=size){
			throw new IndexOutOfBoundsException("Overflow Exception");
		}
		else{
			data[++top]=x;
		}
		
	}
	public int pop(){
		int p; 
		if(top==-1){
			throw new NoSuchElementException("Underflow Exception");	
		}
		else{
			p=data[top--];
		}
		return p;
				
	}
	public boolean isEmpty(){
		return top==-1;
	}
}
