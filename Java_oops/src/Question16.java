import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			String s="";
			for(int i=0;i<s1.length();i++) {
				s+=s1.charAt(i);
				s+=s2.charAt(i);
			}
			System.out.println(s);
		}
	}

}
