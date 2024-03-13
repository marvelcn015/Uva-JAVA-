import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int set = sc.nextInt();
		while (set-- > 0) {
			int L = sc.nextInt();
			int[] arr = new int[L];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			int count = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
						count++;
					}
				}
			}

			System.out.println("Optimal train swapping takes " + count + " swaps.");
		}
	}
}
