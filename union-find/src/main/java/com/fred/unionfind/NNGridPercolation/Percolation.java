package com.fred.unionfind.NNGridPercolation;

import java.util.Arrays;

import javax.print.attribute.standard.Compression;

import com.fred.unionfind.union_find.WeightedQuickUnionWithPathCompression;

public class Percolation {
	private int N;
	private int[] id;

	public Percolation(int n) {
		N = n;
		id = new int[N*N];
		for (int i = 0; i < id.length; i++) {
			id[i]=i;
		}
	}
	
	public void openCell() {
		
	}
	
	public boolean percolated() {
		return false;
	}
	

	@Override
	public String toString() {
		return "Percolation [N=" + N + ", id=" + Arrays.toString(id) + "]";
	}	
	
	
	
	
	
}
