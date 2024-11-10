package com.fred.unionfind.NNGridPercolation;

import java.util.Arrays;
public class Percolation {
	
	private int [] id;
	private int n;
	private boolean [] open; 

	public Percolation(int N) { 
		id = new int[N*N+2];
		open = new boolean [N*N+2];
		for (int i = 0; i < id.length; i++) { // i-1, i-2 => top and bottom virtual nodes
			id[i]=i;
		}
		n=N;
	}

	public int getTopVirtualNode() {
		return this.id[this.id.length-2];
	}
	
	public int getBottomVirtualNode() {
		return this.id[this.id.length-1];
	}
	
	public void printGrid() {
		System.out.print("Top-> " + getTopVirtualNode());
		for (int i = 0; i < id.length-2; i++) {
			if(i%n==0) {
				System.out.print("\n\n");
			}
			System.out.print(id[i]+"\t");
		}
		System.out.print("\n\nBottom-> " + getBottomVirtualNode());
	}

	@Override
	public String toString() {
		return "Percolation [id=" + Arrays.toString(id) + ", open=" + Arrays.toString(open) + "]";
	}
	
	public boolean isOpen(int i) {
		return open[i];		
	}
	
	
	
}
