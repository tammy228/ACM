import java.util.*;
public class no_316_B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		int rightlength = n - m;
		if(n == 1) {
			System.out.println(n);
		}else {
			if(rightlength <= m-1)
				System.out.println(m-1);
			else
				System.out.println(m+1);
		}
	}
}
