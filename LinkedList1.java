package DataStructure;

public class LinkedList1 {

Node head; // head of list 
    	static class Node 
{ 
        		int data; 
        		Node next; 
        		Node(int d) 
        		{ 
            			data = d; 
            			next = null; 
        		} 
    	} 
// Method to insert a new node 
    	public static LinkedList1 insert(LinkedList1 list1, int data) 
    	{ 
        		// Create a new node with given data 
        		Node new_node = new Node(data); 
        		new_node.next = null; 
   		// If the Linked List is empty, then make the new node as head 
        		if (list1.head == null) 
{ 
            			list1.head = new_node; 
        		} 
        		else 
{ 
            			// Else traverse till the last node and insert the new_node there 
            			Node last = list1.head; 
            			while (last.next != null) 
{ 
                			last = last.next; 
            			} 
   			// Insert the new_node at last node 
            			last.next = new_node; 
        		} 
        		return list1; 
    	} 
   	public static void printList(LinkedList1 list1) 
    	{	 
        		Node currNode = list1.head; 
        		System.out.print("LinkedList1: "); 
        		// Traverse through the LinkedList 
        		while (currNode != null) 
{ 
            			// Print the data at current node 
            			System.out.print(currNode.data + " "); 
            			// Go to next node 
            			currNode = currNode.next; 
        		} 
        		System.out.println(); 
    	} 
    	// Method to delete a node in the LinkedList by KEY 
    	public static LinkedList1 deleteByKey(LinkedList1 list1, int key) 
    	{ 
        		// Store head node 
        		Node currNode = list1.head, prev = null; 
        		if (currNode != null && currNode.data == key) 
{ 
            			list1.head = currNode.next; // Changed head 
            			System.out.println(key + " found and deleted"); 
            			return list1; 
        		} 
        		while (currNode != null && currNode.data != key) 
{ 
            			prev = currNode; 
            			currNode = currNode.next; 
        		} 
        		if (currNode != null) 
{ 
            			prev.next = currNode.next; 
            			System.out.println(key + " found and deleted"); 
        		} 
        		if (currNode == null) 
{ 
            			System.out.println(key + " not found"); 
        		} 
        		return list1; 
    	} 
    	// method to create a Singly linked list with n nodes 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Start with the empty list. */
		LinkedList1 list1 = new LinkedList1(); 
		// Insert the values 
		list1 = insert(list1, 1); 
		list1 = insert(list1, 2); 
		list1 = insert(list1, 3); 
		list1 = insert(list1, 4); 
		list1 = insert(list1, 5); 
		list1 = insert(list1, 6); 
		list1 = insert(list1, 7); 
		list1= insert(list1, 8); 
		// Print the LinkedList 
		printList(list1); 
		// Delete node with value 1 
		deleteByKey(list1, 1); 
		// Print the LinkedList 
		printList(list1); 
		// Delete node with value 4 
		deleteByKey(list1, 4); 
		// Print the LinkedList 
		printList(list1); 
		// Delete node with value 10 
		deleteByKey(list1, 10); 
		// Print the LinkedList 
		printList(list1); 

		

	}

}
