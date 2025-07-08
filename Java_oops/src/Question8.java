import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s=sc.nextLine();
			String s2="";
			for(int i=s.length()-1;i>=0;i--) {
				s2+=s.charAt(i);
			}
			if(s.equals(s2)) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not a Palindrome");
			}
		}
	}

}
