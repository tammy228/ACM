import java.util.*;
public class no_300_B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count=0;
		sc.close();
		String ans="",temp="";
		while(input != 0) {
			int input2 = input;
			for(int i=0; i<Integer.toString(input).length(); i++) {
				int digit = input2 % 10;
				if(digit == 0)
					temp += "0";
				else
					temp += "1";
				input2 /= 10;
			}
			StringBuilder sb = new StringBuilder(temp);
			temp = sb.reverse().toString();
			input -= Integer.parseInt(temp);
			ans += temp;
			ans += " ";
			temp = "";
			count++;
		}
		System.out.println(count + "\n" + ans);
	}
}
