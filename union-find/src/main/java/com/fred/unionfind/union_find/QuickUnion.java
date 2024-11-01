package com.fred.unionfind.union_find;

import java.util.Arrays;
import java.util.Iterator;

public class QuickUnion {

	private int[] id;

	// constructor to initialize id[] with length N
	public QuickUnion(int N) {
		this.id = new int[N];
		for (int i = 0; i < id.length; i++) {
			this.id[i] = i;
		}
	}

	//root
	public int root(int i) {
		while (i != id[i]) {
			i = id[i];
		}
		return i;
	}
	
	// connected(p, q)
	public boolean connected(int p, int q) {
		return root(q) == root(p);
	}

	
	// union(p, q)
	public void union(int p, int q) {
		this.id[root(p)] = root(q);
	}

	@Override
	public String toString() {
		return "QuickUnion [id=" + Arrays.toString(id) + "]";
	}

}
