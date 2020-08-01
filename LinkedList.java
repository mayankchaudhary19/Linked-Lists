package LinkedLists;

public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	// summary elements
	private Node head;
	private Node tail;
	private int size;

	// how to traverse a linked list
	// O(1) complexity

	public void display() {

		System.out.println("-----------------");

		Node temp = this.head; // with this we access data members of the parent class

		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}

		System.out.println(" ");
		System.out.println("-----------------");

	}

	// O(1) Complexity, due to tail data member of LL class,complexity of add last()
	// decreases to O(1) from O(n)
	public void addLast(int item) {

		// create a node

		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// add a node at last (attaching a node)

		if (this.size >= 1) {
			this.tail.next = nn;
		}

		// update the summary elements

		if (this.size == 0) {
			this.tail = nn;
			this.head = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}

	}

	// O(1) Complexity
	public void addFirst(int item) {

		// add new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach node
		if (this.size >= 1) {
			nn.next = this.head;
		}

		// updating summary object
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}

	}

	// Did after Remove At
	// O(n) complexity
	public void addAt(int item, int index) throws Exception {

		System.out.println(this.size);

		if (index == 0) {
			addFirst(item);
		} else if (index == this.size) {
			addLast(item);
		} else {
			Node npresent = getNodeAt(index);
			Node nprevious = getNodeAt(index - 1);
			Node temp = new Node();
			temp.data = item;
			temp.next = npresent;
			nprevious.next = temp;
			this.size++;
		}

	}

	// O(1) complexity
	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Empty LinkedList");
		}
		return this.head.data;
	}

	// O(1) complexity
	public int getLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("Empty LinkedList");
		}

		return this.tail.data;

	}

	// O(n) complexity
	public int getAt(int index) throws Exception {

		if (this.size == 0) {
			throw new Exception("Empty Linked List");
		}

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		Node temp = this.head;

		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	// O(n) complexity
	private Node getNodeAt(int index) throws Exception { // Returns Entire Node

		if (this.size == 0) {
			throw new Exception("Empty LL");
		}

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		Node temp = this.head;

		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}

		return temp;

	}

	// O(1) complexity
	public int removeFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("Empty LL");
		}

		int returnValue = this.head.data;

		if (size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
//			Node temp= this.head;
//			this.head= temp.next;
//			or
			this.head = this.head.next;
			this.size--;
		}

		return returnValue;

	}

	// O(n) Complexity
	public int removeLast() throws Exception {

		int returnValue = this.tail.data;

		if (this.size == 0) {
			throw new Exception("Empty List");
		}

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node temp = getNodeAt(this.size - 2);
			this.tail = temp;
			this.tail.next = null;
			this.size--;
		}

		return returnValue;
	}

//	NOTE: Complexity of removing a node at last has O(n) complexity,
//	but the complexity of addFirst, addLast and RemoveFirst is O(1)

	// O(n) Complexity
	public int removeAt(int index) throws Exception {
		int rv = 0;
		if (this.size == 0) {
			throw new Exception("Empty Size");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		if (index == 0) {
			return removeFirst(); // this will update tail and head automatically else we would have to update
									// tail and head whenever first or last node are changed.
		} else if (index == this.size - 1) {
			return removeLast();
		} else {
			Node temp1 = getNodeAt(index);
			rv = temp1.data;
			Node temp2 = getNodeAt(index - 1);
			temp2.next = temp1.next;
			this.size--;
		}
		return rv;
	}

	public void reverseData() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node nl = getNodeAt(left);
			Node nr = getNodeAt(right);
			int temp = nl.data;
			nl.data = nr.data;
			nr.data = temp;
			left++;
			right--;
		}

	}

	public void reversePointers() throws Exception {

		Node previous, current;

		previous = this.head;
		current = previous.next;

		while (current != null) {
			Node ahead = current.next;

			// changing next
			current.next = previous;

			// shifting variables
			previous = current;
			current = ahead;

		}

		// swapping head and tail
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		// tail.next should be null
		this.tail.next = null;
	}

	public int midPointUsingGetAt() throws Exception {

		if (this.size % 2 == 0) {
			return getAt((this.size / 2) - 1);
		} else {
			return getAt(this.size / 2);

		}
	}

//without using the size of the linked list

	public int getMid() {
		Node A, B;
		A = this.head;
		B = A;

		while (B.next != null && B.next.next != null) {
			A = A.next;
			B = B.next.next;
		}
		return A.data;

//		Node slow = this.head;
//		Node fast = slow;
//
//		while (fast.next != null && fast.next.next != null) {
//			slow = slow.next;
//			fast = fast.next.next;
//		}
//		return slow.data;
	}

}
