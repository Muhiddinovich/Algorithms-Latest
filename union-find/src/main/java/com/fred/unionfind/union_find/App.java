package com.fred.unionfind.union_find;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        QuickFindUF quickFindUF = new QuickFindUF(10);
        
        quickFindUF.union(4, 3);
        quickFindUF.union(3, 8);
        quickFindUF.union(6, 5);
        quickFindUF.union(9, 4);
        quickFindUF.union(2, 1);
        quickFindUF.union(5, 0);
        quickFindUF.union(7, 2);
        quickFindUF.union(6, 1);
        
        System.out.println(quickFindUF.toString());
        System.out.println(quickFindUF.connected(4, 9));
    	
    	
    }
}
