import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int size=s1.length();
		if(size%2==0) {
			for(int i=0;i<(size/2);i++) {
				System.out.print(s1.charAt(i));
			}
		}else {
			System.out.print("null");
		}
	}

}
