package stack;

public class Node {
	protected int data;
	protected Node link;
	public Node(){
		link=null;
		data=0;
	}
	public Node(int data,Node n){
		this.data=data;
		link=n;
	}
	public void setData(int d){
		data=d;
	}
	public void setLink(Node n){
		link=n;
	}
	public int getData(){
		return data;
	}
	public Node getLink(){
		return link;
	}
}
