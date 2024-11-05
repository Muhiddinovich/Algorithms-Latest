package com.fred.unionfind.union_find;

import java.util.Arrays;

public class WeightedQuickUnion {
	private int[] id;
	private int[] sz;

	public WeightedQuickUnion(int N) {
		id = new int[N];
		sz = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
			sz[i] = 1;
		}

	}

	public int root(int i) {
		while (id[i] != i) {
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

	@Override
	public String toString() {
		return "WeightedQuickUnion [id=" + Arrays.toString(id);
	}

}
