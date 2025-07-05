package java_fundamentals;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ori=n;
		int s=0;
		while(n>0) {
			int digit=n%10;
			s=s*10+digit;
			n=n/10;
		}
		if(ori==s) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
