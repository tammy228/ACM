import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_399_B {

    private static long sizeOfAku(long n, long total){
        if(n==1)return total;
        else if(n==0)return 0;
        return total+sizeOfAku(n/2, total*2);
    }

    public static long akuIsHere(long n, long l, long r, long lb, long rb){
        if(lb>=l && rb <= r){
            return n;
        }
        else if (lb > r || rb < l){
            return 0;
        }
        else{
            long mid = (lb+rb)/2;
            return akuIsHere(n/2, l, r, lb, mid-1)
                    + akuIsHere(n%2, l, r, mid, mid)
                    + akuIsHere(n/2, l, r, mid+1, rb);
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String[] whereIsAku = reader.readLine().split(" ");

            long n = Long.parseLong(whereIsAku[0]);
            long l = Long.parseLong(whereIsAku[1]);
            long r = Long.parseLong(whereIsAku[2]);

            long akuSize = sizeOfAku(n, 1);

            long count = akuIsHere(n, l, r,1 ,akuSize);

            System.out.println(count);
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
}