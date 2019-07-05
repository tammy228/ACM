import java.util.*;
public class no_377_B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		int increaseDays = 0;
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		for(int i=1; i<n; i++) {
			if((a[i-1] + a[i]) < k ) {
				increaseDays += k - (a[i-1] + a[i]);
				a[i] += k - (a[i-1] + a[i]);
			}
		}
		System.out.println(increaseDays);
		for(int i=0; i<n; i++)
			System.out.print(a[i] + " ");
	}
}
