package stack;

public class StackArrayImplementation {
	private String[] s;
	private int N = 0;

	public StackArrayImplementation(int capacity) {
		s = new String[capacity];
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public void push(String item) {
		s[N++] = item;// use index of N into array; then increments N
	}

	public String pop() {
		return s[--N]; // decrement N and uses to indext into array;
	}

//	public static void main(String[] args) {
//
//		StackArrayImplementation stack = new StackArrayImplementation(10);
//		stack.push("A");
//		stack.push("B");
//		stack.push("C");
//
//		System.out.println(stack.pop()); // Output: C
//		System.out.println(stack.pop()); // Output: B
//		System.out.println(stack.pop()); // Output: A
//		System.out.println(stack.isEmpty()); // Output: true
//	}

}
