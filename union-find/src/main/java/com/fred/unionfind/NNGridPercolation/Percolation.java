package com.fred.unionfind.NNGridPercolation;

import java.util.Arrays;

public class Percolation {

	private int[] id;
	private int n;
	private boolean[] open;

	public Percolation(int N) {
		id = new int[N * N + 2];
		open = new boolean[N * N + 2];
		for (int i = 0; i < id.length; i++) { // i-1, i-2 => top and bottom virtual nodes
			id[i] = i;
		}
		n = N;
	}

	@Override
	public String toString() {
		return "Percolation [id=" + Arrays.toString(id) + ", \nopen=" + Arrays.toString(open) + "]";
	}

	public int getTopVirtualNode() {
		return this.id[this.id.length - 2];
	}

	public int getBottomVirtualNode() {
		return this.id[this.id.length - 1];
	}

	public void printGrid() {
		System.out.print("Top-> " + getTopVirtualNode());
		for (int i = 0; i < id.length - 2; i++) {
			if (i % n == 0) {
				System.out.print("\n\n");
			}
			System.out.print(id[i] + "\t");
		}
		System.out.print("\n\nBottom-> " + getBottomVirtualNode());
	}

	public boolean isOpen(int i) {
		return open[i];
	}

	// checking if i is one of the corners
	public boolean isTopLeftCorner(int i) {
		return i == 0;
	}

	public boolean isTopRightCorner(int i) {
		return i == (n - 1);
	}

	public boolean isBottomLeftCorner(int i) {
		return i == (n * n - n);

	}

	public boolean isBottomRightCorner(int i) {
		return i == (n * n - 1);
	}

//	checking if i is in the edges and excluding edges

	public boolean isTopEdge(int i) {
		return (i > 0) && (i < n - 1);

	}

	public boolean isBottomEdge(int i) {
		return (i > (n * n - n)) && (i < (n * n - 1));
	}

	public boolean isLeftEdge(int i) {
		return (i % n == 0) && (!isTopLeftCorner(i)) && !isBottomLeftCorner(i);
	}

	public boolean isRightEdge(int i) {
		return (i % n == (n - 1)) && (!isTopRightCorner(i)) && (!isBottomRightCorner(i));

	}

}
