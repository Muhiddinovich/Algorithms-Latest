package stack.linkedListImplementation;

public class LinkedListStack {
	private Node first = null;// top of the stack

	public boolean isEmpty() {
		return first == null;
	}

	public void push(String item) {
		Node oldFirst = first;
		first=new Node();
		first.item=item;
		first.next=oldFirst;
	}
	public String pop() {
		String item=first.item;
		first=first.next; //the old top node becomes unreachable, and the Java garbage collector will clean it up automatically.
		return item;
	}
	
//	public static void main(String[] args) {
//        LinkedListStack stack = new LinkedListStack();
//
//        stack.push("A");
//        stack.push("B");
//        stack.push("C");
//
//        System.out.println(stack.pop()); // Output: C
//        System.out.println(stack.pop()); // Output: B
//        System.out.println(stack.pop()); // Output: A
//        System.out.println(stack.isEmpty()); // Output: true
//    }

}
