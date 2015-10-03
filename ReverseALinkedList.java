package com.interview.prep.datastructure.LinkedList;

public class ReverseALinkedList {
	
	/**
	 * Reverse a linked list
	 */
	
	Node head;
	Node tail;
	int size ;
	
	void addElementsToLinkedList(Object data){
		
		Node newnode = new Node(data);
		if(head == null){
			//this is the first add
			head = newnode;
			tail = head;
		}else{
			tail.setNext(newnode);
			tail = newnode;
		}
	}
	
	void traverseLinkedList(){
		Node temp = head;
		while(true){
			
			if(temp == null){
				System.out.println("Linked list is empty");
				break;
			}else{
				System.out.println("This is data in node "+temp.getData()+"\n this is reference to next node "+temp.getNext());
				temp = temp.getNext();
			}
			size++;
		}
		
	}
	
	void reverseLinkedList(){
		
		//Get the size of the list :
		int sizeOfList = size;
		Node temp = head;
		Node current ;
		Node reversedPart= null ;
		current = head;
		for(int i =0 ; i<size; i++){
			
			System.out.println("This is current node \n"+ current);
			if(current == null){
				System.out.println("We are at the end of list");
				break;     
			}
			Node next =  current.getNext();
			current.next = reversedPart ;
			reversedPart = current;
			current = next;
		}
		head = reversedPart;
		
		//login, whicver node you are wokring on set the next node to tht as null, because we have to keep the last node as null
		//also, keep seeting the  current node as reversed node
	}
	
	void printAReversedLinkedlist(){
		
		Node temp = head;
		while(true){
			
			if(temp == null){
				System.out.println("We have reached end of Linkedlist");
				break;
			}
			System.out.println("This is the reversed link list  "+temp.getData() +"  This is the reference in the node  "+temp.getNext());
			temp = temp.getNext();
		}
	}
	
	
	public static void main(String args[]){
		ReverseALinkedList  reverseLinkedlist = new ReverseALinkedList();
		
		reverseLinkedlist.addElementsToLinkedList("ThisIsFirstAdd");
		reverseLinkedlist.addElementsToLinkedList("Second");
		reverseLinkedlist.addElementsToLinkedList("Third");
		reverseLinkedlist.addElementsToLinkedList("Fourth");
		reverseLinkedlist.addElementsToLinkedList("Fifith");
		reverseLinkedlist.addElementsToLinkedList("Sixth");
		reverseLinkedlist.addElementsToLinkedList("Seventh");
		reverseLinkedlist.traverseLinkedList();
		reverseLinkedlist.reverseLinkedList();
		reverseLinkedlist.printAReversedLinkedlist();
	}

}


