package java_fundamentals;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			char ch=sc.next().charAt(0);
			char ch1=Character.toLowerCase(ch);
			switch(ch1) {
			case 'r':
				System.out.println("Red");
				break;
			case 'b':
				System.out.println("Blue");
				break;
			case 'g':
				System.out.println("Green");
				break;
			case 'y':
				System.out.println("Yellow");
				break;
			case 'o':
				System.out.println("orange");
				break;
			case 'w':
				System.out.println("White");
				break;
			default:
				System.out.println("Invalid code");
			}
		}
	}

}
