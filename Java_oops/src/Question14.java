import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s=sc.nextLine();
			if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x') {
				for(int i=1;i<s.length()-1;i++) {
					System.out.print(s.charAt(i));
				}
			}else {
				System.out.print(s);
			}
		}
	}

}
