package observation;

import java.util.Scanner;

public class ThreeSum { // Brute Force Algorithm
	public static int count(int[] a) {
		int N = a.length;
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					if ((a[i] + a[j] + a[k]) == 0) {
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.print("Array size: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // Read the size of the array
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + a[i] + "]=");
			a[i] = scanner.nextInt(); // Read each element of the array
		}
		scanner.close();
		System.out.println("ThreeSum= " + count(a));

	}
}
