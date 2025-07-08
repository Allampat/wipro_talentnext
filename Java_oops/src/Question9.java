import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			String r="";
			if(s1.charAt(s1.length()-1)==s2.charAt(0)) {
				for(int i=0;i<s1.length();i++) {
					r+=s1.charAt(i);
				}
				for(int i=1;i<s2.length();i++) {
					r+=s2.charAt(i);
				}
			}else {
				r=s1+" "+s2;
			}
			System.out.println(r.toLowerCase());
		}
	}

}
