package LinkedLists;

public class Client {

	public static void main(String[] args) throws Exception{
		
		LinkedList list=new LinkedList();
		
		list.display();
		
		list.addLast(10);
		list.addLast(20);
//		list.addLast(30);
//		list.addLast(40);
	
//
//		list.display();
		
		
//		list.addFirst(10);
//		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
//		list.addFirst(50);
		list.addLast(50);
		list.display();
		
		System.out.print("Get First:");
		System.out.println(list.getFirst());
		
		System.out.print("Get Last:");
		System.out.println(list.getLast());
		
		System.out.print("Get At 2:");
		System.out.println(list.getAt(2));
		
		System.out.print("Remove First:");
		System.out.println(list.removeFirst());
		list.display();
		
		System.out.print("Remove Last:");
		System.out.println(list.removeLast());
		list.display();
		
		System.out.print("Remove At 1:");
		System.out.println(list.removeAt(1));
		list.display();
	
		System.out.print("Remove At 0:");
		System.out.println(list.removeAt(0));
		list.display();
		
		System.out.print("Add At 1:");
		list.addAt(70,1);
		list.display();
		
		System.out.print("Add At 1:");
		list.addAt(10,1);
		list.display();
		
		System.out.print("Add At 1:");
		list.addAt(50,1);
		list.display();
//		
//		System.out.print("Add At 1:");
//		list.addAt(90,3);
//		list.display();
		
		System.out.println("Reverse Linked List using Reverse Data :");
		list.reverseData();
		list.display();
		
		System.out.println("Reverse Linked List using Reverse Pointers :");
		list.reversePointers();
		list.display();
		
		System.out.println("Mid Of LL :");
		System.out.println(list.midPointUsingGetAt());

		
		System.out.println("Mid Of LL :");
		System.out.println(list.midPointUsingGetAt());
	}

}
