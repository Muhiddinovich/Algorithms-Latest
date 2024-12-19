package generics;

public class GenericsStackFixedArray<Item> {
	private Item[] s;
	private int N = 0;

	public GenericsStackFixedArray(int capacity) {
		s = (Item[]) new Object[capacity];
	}
	
	public boolean isEmpty() {
		return N==0;
	}
	
	public void push(Item item) {
		s[N++]=item;
	}
	
	public Item pop() {
		return s[--N];
	}
}
