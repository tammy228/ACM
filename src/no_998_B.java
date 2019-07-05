import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class no_998_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[n];
        PriorityQueue<Integer> greedy=new PriorityQueue<>();
        int odd=0;
        int even=0;
        arr[0]=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i!=n)
                arr[i]=sc.nextInt();
            if(arr[i-1]%2==0){
                even++;
            }
            else odd++;
            if(i!=n&&even==odd){
                even=0;
                odd=0;
                greedy.add(Math.abs(arr[i]-arr[i-1]));
            }
        }
        int count=0;
        while(greedy.size()>0){
        	int f = greedy.poll();
            b-=f;
            System.out.println("cut:" + f);
            if(b<0)
                break;
            count++;
        }
        pw.print(count);
        pw.close();
    }
}