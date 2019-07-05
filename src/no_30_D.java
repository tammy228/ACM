import java.util.*;
public class no_30_D {
	static int a[];
	static int count;
	static int cnt=1;
	static void merge(int start, int end) {
		if(count == 0)		return;
		if(start >= end)	return;
		else {
			int mid = (start + end) >> 1;
//			if((start+end)%2==0)	unsolve
//				mid--;
			int temp=a[mid];
			a[mid]=a[mid+1];
			a[mid+1]=temp;
			count-=2;
			cnt+=2;
			merge(start,mid);
			merge(mid+1,end);
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		count = sc.nextInt();
		sc.close();
		a = new int[size];
		for(int i=0; i<size; i++)
			a[i] = i+1;
		if((count & 1) == 0 ) {
			System.out.println("-1");
		}else {
			count--;
			if(count != 1) {
				merge(0,size-1);
			}
			if(count != 0) {	//�]���D�ت����M�ƥi��W�Larray�ү�����A�ҥHmerge�������A�P�_�@��
				System.out.println("-1");
			}else {
				for(int i=0; i<size; i++)
					System.out.print(a[i] + " ");
			}
		}
	}
}
