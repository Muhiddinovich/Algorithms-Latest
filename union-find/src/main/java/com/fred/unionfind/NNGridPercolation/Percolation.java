package com.fred.unionfind.NNGridPercolation;

import java.util.Arrays;

public class Percolation {

	private int[] id;
	private int n;
	private boolean[] open;
	private int[] sz; // to track size of tree in order to WeightedQuickUnion

	public Percolation(int N) {
		id = new int[N * N + 2];
		open = new boolean[N * N + 2];
		sz = new int[N * N + 2];
		for (int i = 0; i < id.length; i++) { // i-1, i-2 => top and bottom virtual nodes
			id[i] = i;
			sz[i] = 1;
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

	public int root(int i) {
		while (id[i] != i) {
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int i = root(p); // i=4
		int j = root(q); // j=3

		if (i == j) {
			return;
		}
		if (sz[i] <= sz[j]) {
			id[i] = j;
			sz[j] += sz[i];
		} else {
			id[j] = i;
			sz[i] += sz[j];
		}
	}

	public void openCell(int i) {
		if (!isOpen(i)) {
			if (isTopLeftCorner(i)) {
				// neighbors: 2x
				//n1=i+1
				//n2=i+n
				// union(i, n1), union(i,n2),union(i, getVirtualTopNode)
			} else if (isTopRightCorner(i)) {
				//neighbors 2x
				//n1=i-1
				//n2=i+n
				//union(i,n1), union(i,n2), union(i,getVirtualTopNode)
			} else if (isBottomLeftCorner(i)) {
				// neighbors 2x
				//n1=i-n
				//n2=i+1
				//union(i, n1), union(i, n2), union(i, getVirtualBottomNode)
			} else if (isBottomRightCorner(i)) {
				//neighbors 2x
				//n1=i-n
				//n2=i-1
				//union(i, n1), union(i, n2), union(i, getVirtualBottomNode)
			} else if (isTopEdge(i)) {
				// Neighbors 3x
				// n1=i-1
				//n2=i+1
				//n3=i+n
				//union(i,n1) union(i, n2) union(i, n3) union(i,getVirtualTopNode )
			} else if (isBottomEdge(i)) {
				// neighbors 3x
				//n1=i-1
				//n2=i+1
				//n3=i-n
				//union(i,n1) union(i, n2) union(i, n3) union(i,getVirtualBottomNode )
			} else if (isLeftEdge(i)) {
				// neighbors 3x
				//n1=i-n
				//n2=i+1
				//n3=i+n
				//union(i,n1) union(i, n2) union(i, n3)
			} else if (isRightEdge(i)) {
				//neighbors 3x
				//n1=i-n
				//n2=i-1
				//n3=i+n
				//union(i,n1) union(i, n2) union(i, n3)
			} else {
				//the node is inside the grid
				//neighbors 4x
				//n1=i-n
				//n2=i-1
				//n3=i+1
				//n4=i+n
				//union(i,n1) union(i, n2) union(i, n3) union(i,n4)
			}
			open[i]=true;
		}
	}

}
