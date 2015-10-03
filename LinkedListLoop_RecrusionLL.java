package com.interview.prep.datastructure.LinkedList;

public class LinkedListLoop_RecrusionLL {
	
	static Node head ;
	Node tail;
	
	void addInLinkedList(int data){
		if(head == null){
			head = new Node(data);
			
			tail = head;
		}else{
			
			Node n = new Node(data);
			tail.next = n;
			
			tail =  n;
		}
	}
	
	
	void traverse(){
		
		Node temp;
		temp = head;
		
		while(temp != null){
			System.out.println(temp.data+"  "+temp.next);
			
			temp = temp.next;
		}
	}
	
	//find loop in a linked list
	void loopInLinkedList(){
		
		
		Node tortoise;
		Node hare;
		//Now the idea is to increase the tortoise by one and hare by 2 hops, if they are equal at some point then the LL contains a loop
		
		hare = tortoise = head;
		
		while(hare.next != null && hare.next.next != null )
		{
			 hare = hare.next.next;   	    //2 hops
			 tortoise = tortoise.next; 		//1 hop
			  
			 if(hare == tortoise ){
				 System.out.println("We have found loop in a ll");
			 }
		}
	}
	
	
	void reverseLinkedList(){
		
		Node temp = head;
		
		Node current = null;
		Node reversedPart = null;
		Node next = null;
		
		current = temp;
		while(current != null){
			
			next = current.next ;
			current.next = reversedPart;
			reversedPart = current;
			
			current = next;	
		}
		head = reversedPart;
	}
	
	
	 void reverseLinkedListRecrusively(Node currentNode){
		
		
		//check for empty list 
		 if(currentNode == null)
		    return;

		/* if we are at the TAIL node:
		    recursive base case:
		 */
		if(currentNode.next == null) 
		{ 
		//set HEAD to current TAIL since we are reversing list
		head = currentNode; 
		return ; //since this is the base case
		}

		//here the last node will be 8. so next.next refers to 9 ka next/.
		reverseLinkedListRecrusively(currentNode.next);
		currentNode.next.next = currentNode;  //8 will point to 9 ka next , which was null before
		System.out.println(currentNode.next.next.data   +"  and and   "+currentNode.data);
		currentNode.next = null; //set "old" next pointer to NULL  and keep 8 ke next mai null.
		
		//now currentNode = 9, and nine ka next matlab, 8 and 7 mail null,
		
		return ;
	}
	 
	 void reverseLinkedLR(Node node){
		 
		 if(node == null){
			 System.out.println("Node is null");
		 }
		 
		 if(node.next == null){
			 System.out.println("We are at the end f ll");
		 }
		 
		 Node next = node.getNext();
		 reverseLinkedLR(next);
	 }
	
	
	public static void main(String[] args) {
		LinkedListLoop_RecrusionLL linkedlist = new LinkedListLoop_RecrusionLL();
		
		for(int x=0; x<10;x++){
			linkedlist.addInLinkedList(x);
		}
		linkedlist.traverse();
	//	linkedlist.reverseLinkedList();
		linkedlist.reverseLinkedListRecrusively(head);
		linkedlist.traverse();
		
	}

}
