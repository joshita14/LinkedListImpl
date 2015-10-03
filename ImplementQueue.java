package com.interview.prep.datastructure.LinkedList;

public class ImplementQueue {

	Node top;
	Node tail;

	/*
	 * Properties of queue:
	 * 
	 * FIFO
	 * 
	 * add, offer remove, poll element, peek
	 * 
	 * addition is from the tail, not from the head
	 */

	// Push elements in linked list
	void push(int data) {

		if (top == null) {
			top = new Node(data);
			System.out.println("This node is head  :" + top.data);
		} else {

			Node n = new Node(data);
            //Logic : we have to keep track of the top element not the tail element as we do in case of queue
			/*
			 * Now the logic is, add element to top, okay, now push the top element to the next of new node and then move the new noe to top, 
			 * In this way the new node becomes top element and the top element becomes next to the new node
			 */
			n.next = top;
			top = n;
		}
	}
	
	void pop(){
		
		/*
		 * Pop is a principle where we have elements are poped from the top of the stack and the next element is pointed to the top
		 */
		//Element is always moved from the top:
		
		if(top != null){
			
			Node temp = top.next;
			top = null;
			top = temp;
		}
		
	}

	void traverseAStack() {

		Node temp = top;

		while (temp != null) {
			System.out.println("This is the Stack node  :" + temp.data + "  "
					+ temp.next);

			temp = temp.next;
		}
		
		//Deletion principle is same in case of dequeue, elments are deleted from TOP and the next cursor is pointed to that
	}

	public static void main(String[] args) {
		ImplementQueue queue = new ImplementQueue();

		for (int x = 0; x < 10; x++) {
			queue.push(x);
		}

		queue.traverseAStack();
		
		System.out.println("*************************************************");
		queue.pop();
		queue.traverseAStack();
	}

}
