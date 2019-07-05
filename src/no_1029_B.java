import java.util.Scanner;

public class no_1029_B {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        long pvs = sc.nextInt();
        int max = 1;
        for(int i=1;i<n;i++) {
            long a = sc.nextInt();
            if(pvs*2 >= a) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
            pvs = a;
        }
        max = Math.max(max, count);
        System.out.println(max);
    }
}