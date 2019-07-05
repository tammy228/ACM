import java.util.*;
public class no_288_B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String ans1="-1",ans2="-1";
		char temp=' ';
		StringBuilder stb = new StringBuilder();
		stb.append(st);
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i) % 2 == 0 && st.charAt(i) < st.charAt(st.length()-1)) {
				temp = st.charAt(i);
				stb.setCharAt(i, st.charAt(st.length()-1));
				stb.setCharAt(st.length()-1, temp);
				ans1 = stb.toString();
				stb.setCharAt(i, st.charAt(i));
				stb.setCharAt(st.length()-1, st.charAt(st.length()-1));
				break;
			}
		}
		for(int i=st.length()-1; i>=0; i--) {
			if(st.charAt(i) % 2 == 0 && st.charAt(i) > st.charAt(st.length()-1)) {
				temp = st.charAt(i);
				stb.setCharAt(i, st.charAt(st.length()-1));
				stb.setCharAt(st.length()-1, temp);
				ans2 = stb.toString();
				stb.setCharAt(i, st.charAt(i));
				stb.setCharAt(st.length()-1, st.charAt(st.length()-1));
				break;
			}
		}
		if(ans1.compareTo(ans2) == 0) {
			if(ans1.equals("-1"))
				System.out.println("-1");
			else
				System.out.println(ans1);
		}else if(ans1.compareTo(ans2) < 0) {
			System.out.println(ans2);
		}else {
			System.out.println(ans1);
		}
	}
}
/*
 Scanner sc = new Scanner(System.in);
		String max="-1";
		char temp=' ';
		String st = sc.nextLine();
		StringBuilder stb = new StringBuilder();
		stb.append(st);
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i) % 2 == 0) {
				temp = st.charAt(i);
				stb.setCharAt(i, st.charAt(st.length()-1));
				stb.setCharAt(st.length()-1, temp);			
				if(max.compareTo(stb.toString()) < 0)
					max = stb.toString();
				stb.setCharAt(i, st.charAt(i));
				stb.setCharAt(st.length()-1, st.charAt(st.length()-1));
			}
		}
		System.out.println(max);
*/