import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		int m=s.length()-n;
		String s1="";
		for(int i=m;i<s.length();i++) {
			s1+=s.charAt(i);
		}
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1);
		}
	}

}
