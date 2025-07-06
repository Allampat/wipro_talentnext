package java_fundamentals;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int A=(int)'A';
			int Z=(int)'Z';
			int a=(int)'a';
			int b=(int)'b';
			char ch=sc.next().charAt(0);
			int n=(int)ch;
			if((n>=A && n<=Z)|| (n>=a && n<=b)) {
				System.out.println("Alphabet");
			}else if(n>=48 && n<=57) {
				System.out.println("Digit");
			}else {
				System.out.println("Special Character");
			}
		}
	}

}
