package LinkedLists;

public class Client_LinkedList_as_Stack_and_Queue {

	public static void main(String[] args) throws Exception {
		

		LinkedList_as_Queue queue= new LinkedList_as_Queue();
		

		LinkedList_as_Stack stack= new LinkedList_as_Stack();
		
		System.out.println("QUEUE");
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		
		queue.enqueue(10);
		queue.display();
		queue.enqueue(20);
		queue.display();
		queue.enqueue(30);
		queue.display();
		queue.enqueue(40);
		queue.display();
		queue.enqueue(50);
		queue.display();
		
		System.out.println(queue.dequeue());
		queue.display();
		
		System.out.print("Front: ");
		System.out.println(queue.front());
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		
		
		//STACk
		
		System.out.println("\nSTACK");
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		
		stack.push(10);
		stack.display();
		stack.push(20);
		stack.display();
		stack.push(30);
		stack.display();
		stack.push(40);
		stack.display();
		stack.push(50);
		stack.display();
		
		System.out.println(stack.pop());
		stack.display();
		
		System.out.print("Front: ");
		System.out.println(stack.top());
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		
	}

}
