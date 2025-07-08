import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s.charAt(0));
		String r="";
		for(int i=0;i<=1;i++) {
			r+=s.charAt(i);
		}
		System.out.println(r);
		for(int i=1;i<=s.length();i++) {
			System.out.print(r);
		}
	}

}
