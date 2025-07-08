import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s=sc.nextLine();
			int x=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='*') {
					x=i;
				}
			}
			for(int i=0;i<x;i++) {
				System.out.print(s.charAt(i));
			}
		}
	}

}
