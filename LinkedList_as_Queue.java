package LinkedLists;

public class LinkedList_as_Queue {

	private LinkedList queue;

	// constructor
	public LinkedList_as_Queue() {
		this.queue = new LinkedList();
	}
	//Complexity: O(1)
	public int size() {
		return this.queue.size();
	}
	//Complexity: O(1)
	public boolean isEmpty() {
		return this.queue.isEmpty();
	}
	//Complexity: O(1)
	public void enqueue(int data) {
		this.queue.addLast(data);
	}
	//Complexity: O(1)
	public int dequeue() throws Exception {
		return this.queue.removeFirst();
	}
	//Complexity: O(1)
	public int front() throws Exception {
		return this.queue.getFirst();
	}
	//Complexity: O(n)
	public void display() {
		this.queue.display();
	}

}
