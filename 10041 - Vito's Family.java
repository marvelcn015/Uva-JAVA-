import java.util.*;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int set = sc.nextInt();
		while(set-- > 0) {
			int r = sc.nextInt();
			int[] array = new int[r];
			for(int i = 0; i<r; i++) {
				array[i] = sc.nextInt();
			}
			
			Arrays.sort(array);
			int sum = 0;
			int half = array[r/2];
			for(int i = 0; i<r; i++) {
				sum += Math.abs(array[i] - half);
			}
			System.out.println(sum);
		}
		return;
	}
}
