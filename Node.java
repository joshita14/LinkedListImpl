package com.interview.prep.datastructure.LinkedList;

//THis is a self created class and does not deal with java class, in java node is an interface
public class Node {
	
	Node next;
	Object data;
	
	
	public Node(Object dataForNode){
		this.data = dataForNode;
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node refrenceFornextnode) {
		this.next = refrenceFornextnode;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

}
