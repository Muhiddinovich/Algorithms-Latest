package com.fred.unionfind.union_find;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Quck Find
		QuickFindUF quickFindUF = new QuickFindUF(10);

		quickFindUF.union(4, 3);
		quickFindUF.union(3, 8);
		quickFindUF.union(6, 5);

		quickFindUF.union(9, 4);
		quickFindUF.union(2, 1);
		quickFindUF.union(5, 0);
		quickFindUF.union(7, 2);
		quickFindUF.union(6, 1);

//        System.out.println(quickFindUF.toString());
//        System.out.println(quickFindUF.connected(4, 9));

		// Quick Union

//		QuickUnion quickUnion = new QuickUnion(10);
//		System.out.println(quickUnion.toString());
//		quickUnion.union(4, 3);
//		System.out.println(quickUnion.toString());
//		quickUnion.union(3, 8);
//		System.out.println(quickUnion.toString());
//		quickUnion.union(6, 5);
//		System.out.println(quickUnion.toString());
//		quickUnion.union(9, 4);
//		System.out.println(quickUnion.toString());
//		quickUnion.union(2, 1);
//		System.out.println(quickUnion.toString());
//		quickUnion.union(5, 0);
//		System.out.println(quickUnion.toString());
//		quickUnion.union(7, 2);
//		System.out.println(quickUnion.toString());
//		quickUnion.union(6, 1);
//		System.out.println(quickUnion.toString());
//		quickUnion.union(7, 3);
//		System.out.println(quickUnion.toString());

		
		WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(10);
		System.out.println(weightedQuickUnion.toString());
		
		weightedQuickUnion.union(4, 3);
		System.out.println(weightedQuickUnion.toString());
		weightedQuickUnion.union(3, 8);
		System.out.println(weightedQuickUnion.toString());
		weightedQuickUnion.union(6, 5);
		System.out.println(weightedQuickUnion.toString());
		weightedQuickUnion.union(9, 4);
		System.out.println(weightedQuickUnion.toString());
		weightedQuickUnion.union(2, 1);
		System.out.println(weightedQuickUnion.toString());
		weightedQuickUnion.union(5, 0);
		System.out.println(weightedQuickUnion.toString());
		weightedQuickUnion.union(7, 2);
		System.out.println(weightedQuickUnion.toString());
		weightedQuickUnion.union(6, 1);
		System.out.println(weightedQuickUnion.toString());
		weightedQuickUnion.union(7, 3);
		System.out.println(weightedQuickUnion.toString());
		System.out.println(weightedQuickUnion.connected(9, 2));
	}
}
