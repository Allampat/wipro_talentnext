package java_fundamentals;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int m=sc.nextInt();
			if(m>0) {
				System.out.println("Positive");
			}else if(m<0) {
				System.out.println("Negative");
			}else {
				System.out.println("Zero");
			}
		}
	}

}
