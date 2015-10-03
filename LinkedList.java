package com.interview.prep.datastructure.LinkedList;

public class LinkedList {
	
	  private Node head ;
	  private Node tail ;
	  static java.util.LinkedList linkedlist = null;
	  static LinkedList list = null;
	  int size = 0;
	 //Creates a single linked list:
     void insertAElement(Object data){
    	 
       // System.out.println("This is the data  :  "+data);
    	Node newNode = new Node(data);
    	newNode.setData(data);   //new node set with data
    	if(head == null){
    		//There is only one element in the node
    		head = newNode;
    		tail = head;  //start and end are the same
    	}else{
    		//we have to add the element in he last and point to the ref of tail to it
    		tail.setNext(newNode);  //first set the end node to point to the new node and then in the last point to the new node, now last node is the node is the new node.
    		tail = newNode;
    	}
      }
     
    int traverseALinkedList(){
    	
    	//Traverse a list
        Node tm = head;
        
        while(true){
        	
        	if(tm == null){
        		//System.out.println("There are no elements in the list");
        		break;
        	}
        	System.out.println("This is the value   :" +tm.getData()+"  This is the refrerence  : "+tm.getNext());
        	System.out.println();
        	tm = tm.getNext();
        	size++;
        }
        return size;
     }
	
    
    void addElementAtSpecificPosition(Object data, int position){
    
    	int index =0;
    	Node currentNode = null;
    	Node nextToCurrentNode = null;
    	Node temp = head;
    	index = position-1;
    	Node updatingNode = new Node(421);
    	
    	for(int i =1; i<size ;i++){
    	    System.out.println("This is value of  i : "+i);
    		if(temp == null){
    			System.out.println("The linked list is empty, please add elements");
    		}else{
    			System.out.println("This is node no : "+i +" and the data  "+temp.getData());
    			updatingNode = temp.getNext();
    			temp = updatingNode; //setting the next node object ..
    		}
    		
    		if(i == index){
    			Node addingANewNode = new Node(data);
//    			addingANewNode.setNext(temp.getNext());
//    		    temp = addingANewNode;    //for node added before
    			
    			
    			currentNode = temp;
    			nextToCurrentNode = temp.getNext();
    			
    			currentNode.setNext(addingANewNode);
    			temp = addingANewNode;    //adding the node afterwords
    			temp.setNext(nextToCurrentNode);
    		}
    	}
    	size++;
    	
    	
    	//Now after all, traverse the lists
    	traverseALinkedList();
   }
     
//     void print(){
//    	 
//    	 insertAElement();
//    	 for(Object s : list){
//    		 String ans = (String)s;
//    		 System.out.println("Printing linkedlist  "+ans);
//    	 }
//     }
	
	public static void main(String args[]){
	
		linkedlist = new java.util.LinkedList();
		linkedlist.add("hello");
		linkedlist.add("hello1");
		linkedlist.add("hello2");
		linkedlist.add("hello3");
		linkedlist.add("hello4");
		linkedlist.size();
		
		
		list = new LinkedList();
		list.insertAElement("hello");
		list.insertAElement(1);
		list.insertAElement("Joshita");
		list.traverseALinkedList();
		list.addElementAtSpecificPosition("HELLOIMAddingTheCompany",2);
	}
}
