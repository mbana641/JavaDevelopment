package cis120.section2.lab03.recursion;

public class Fib {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		for (int i = 0; i < 15; i++) {
			System.out.print(fib1(i) + " ");
		}

		long elapsedTime = System.nanoTime() - startTime;
		System.out.println("\n" + "Elapsed time for recursive in nanoseconds: " + elapsedTime);

		System.out.println("\n");

		long startTime2 = System.nanoTime();

		for (int i = 0; i < 15; i++) {
			System.out.print(fib2(i) + " ");
		}

		long elapsedTime2 = System.nanoTime() - startTime2;
		System.out.println("\n" + "Elapsed time for iterative in nanoseconds: " + elapsedTime2);
	}

	public static int fib1(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fib1(n - 1) + fib1(n - 2);

	}

	public static int fib2(int n) {
		int[] fibArray = new int[n + 1];
		int first = 0;
		int second = 1;
		int nth = 1;
		if (n == 0) {
			fibArray[n] = n;
		}
		if (n == 1) {
			fibArray[n] = n;
		}
		for (int i = 2; i <= n; i++) {
			nth = first + second;
			first = second;
			second = nth;
			fibArray[i] = nth;
		}
		return fibArray[n];
	}
}
