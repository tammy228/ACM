import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no_295_B {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer out = new StringBuffer();
		StringTokenizer tk;

		tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken()), m = Integer.parseInt(tk.nextToken());

		Queue<Integer> queue = new LinkedList<>();
		HashSet<Integer> set = new HashSet<>();

		queue.add(n);

		int steps = 0;
		while (true) {

			int s = queue.size();

			boolean solved = false;
			for (int i = 0; i < s; i++) {
				if (queue.peek() == m) {
					solved = true;
					break;
				}
				if (!set.contains(2 * queue.peek()) && queue.peek() <= m) {
					queue.add(2 * queue.peek());
					set.add(2 * queue.peek());
				}
				if (!set.contains(queue.peek() - 1) && queue.peek() - 1 >= 0) {

					queue.add(queue.peek() - 1);
					set.add(queue.peek() - 1);
				}

				queue.remove();
			}

			if (solved) {
				break;
			}
			steps++;
		}
		System.out.println(steps);
	}

}


/*
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
scan.close();
int ans = 0;
while (m > n) {
            if (m % 2 != 0) {
                m++;
                ans++;
            } else {
                m /= 2;
                ans++;
            }
        }

        System.out.println(ans + (n - m));
*/
