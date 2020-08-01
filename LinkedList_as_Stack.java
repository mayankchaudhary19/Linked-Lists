package LinkedLists;

public class LinkedList_as_Stack {

	private LinkedList stack;

	// constructor
	public LinkedList_as_Stack() {
		this.stack = new LinkedList();
	}
	//Complexity: O(1)
	public int size() {
		return this.stack.size();
	}
	//Complexity: O(1)
	public boolean isEmpty() {
		return this.stack.isEmpty();
	}
	//Complexity: O(1)
	public void push(int data) {
		this.stack.addFirst(data);
	}
	//Complexity: O(1)
	public int pop() throws Exception {
		return this.stack.removeFirst();
	}
	//Complexity: O(1)
	public int top () throws Exception {
		return this.stack.getFirst();
	}
	//Complexity: O(n)
	public void display() {
		this.stack.display();
	}

}
