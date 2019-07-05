import java.util.*;
public class no_303_B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		StringBuilder ans = new StringBuilder();
		sc.close();
		int onezero=0,zeroone=0,diff=0;
		for(int i=0; i<s.length(); i++) {
			//ans.append(0);
			ans.append(0);
			if(s.charAt(i) == '0' && t.charAt(i) == '1')
				zeroone++;
			if(s.charAt(i) == '1' && t.charAt(i) == '0')
				onezero++;
		}
		int more=onezero;
		diff = Math.abs(zeroone-onezero);
		diff = diff >> 1;
		if(zeroone > onezero)	more=zeroone;	
		if(((zeroone+onezero) & 1) == 0) {
			for(int i=s.length()-1; i>=0; i--) {
				if(diff !=0) {
					if(more == onezero) {
						if(s.charAt(i) == '1' && t.charAt(i) == '0') {
							ans.setCharAt(i, '1');
							diff--;
						}
					}else {
						if(s.charAt(i) == '0' && t.charAt(i) == '1') {
							ans.setCharAt(i, '1');
							diff--;
						}
					}
				}else break;
			}
		}
		if(diff==0 && ((zeroone+onezero) & 1) == 0)
			System.out.println(ans);
		else
			System.out.println("impossible");
	}
}
