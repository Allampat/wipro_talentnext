package java_fundamentals;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			if(n%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
	}

}
