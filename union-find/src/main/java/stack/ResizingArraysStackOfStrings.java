package stack;

public class ResizingArraysStackOfStrings {
	private String []s;
	private int N = 0;
	public ResizingArraysStackOfStrings() {
		this.s=new String [1];
	}
	public void push(String item) {
		if(N==s.length) {
			resize(2*s.length);
		}
		s[N++]=item; // use index of N into array; then increments N
	}
	
	public String pop() {
		String item= s[--N];// decrement N and uses to indext into array;
		s[N]=null;
		if(N>0 && N ==s.length/4) {
			resize(s.length/2);
		}
		return item; 
	}
	
	public void resize(int capacity) {
		String [] copy =new String[capacity];
		for (int i = 0; i < N; i++) {
			copy[i]=s[i];
		}
		s=copy;
	}
	
}
