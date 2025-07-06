package java_fundamentals;

import java.util.Scanner;

public class Question4B {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int m=sc.nextInt();
			int n=sc.nextInt();
			String s=String.valueOf(m);
			String s2=String.valueOf(n);
			if(s.charAt(s.length()-1)==s2.charAt(s2.length()-1)) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
	}

}
