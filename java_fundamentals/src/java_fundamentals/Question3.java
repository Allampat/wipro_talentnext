package java_fundamentals;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			System.out.println("The sum of "+n+" and "+m+" numbers is "+(n+m));
		}
	}

}
