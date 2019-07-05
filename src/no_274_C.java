import java.util.*;
public class no_274_C {
	public static class exam implements Comparable<exam>{
		int a;
		int b;
		public exam(int a, int b){
			this.a = a;
			this.b = b;
		}
		public int compareTo(exam other) {
			if(this.a > other.a) return 1;
			if(this.a < other.a) return -1;
//			if(this.b < other.b) return 2;
			else return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		exam[] exam = new exam[size];
		for(int i=0; i<size; i++) {
			exam[i] = new exam(sc.nextInt(),sc.nextInt());
		}
		sc.close();
		Arrays.sort(exam);
//		for(int i=0; i<exam.length; i++) {
//	    	System.out.print("exam[" + i + "].a= "+ exam[i].a + ",exam[" + i + "].b= "+ exam[i].b);
//	    	System.out.println();
//	    }
		int ans=0;
		if(exam[0].b < exam[0].a)	ans = exam[0].b;
		else ans = exam[0].a;
		for(int i=1; i<exam.length; i++) {
			if(exam[i].b < ans)	
				if(exam[i-1].a < exam[i].a)
					ans = exam[i].a;
				else;
			else ans = exam[i].b;
		}
		System.out.println(ans);
	}
}