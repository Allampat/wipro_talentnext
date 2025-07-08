import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			int m=s1.length();
			int n=s2.length();
			if(m>n) {
				System.out.print(s2+s1+s2);
			}else {
				System.out.print(s1+s2+s1);
			}
		}
	}

}
