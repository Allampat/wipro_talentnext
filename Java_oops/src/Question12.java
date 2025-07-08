import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s=sc.nextLine();
			for(int i=1;i<s.length()-1;i++) {
				System.out.print(s.charAt(i));
			}
		}
	}

}
