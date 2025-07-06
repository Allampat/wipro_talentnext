package java_fundamentals;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine().trim();

			if (input.isEmpty()) {
			    System.out.println("No Values");
			} else {
			    String[] values = input.split("\\s+");
			    for (int i = 0; i < values.length; i++) {
			        System.out.print(values[i]);
			        if (i < values.length - 1) {
			            System.out.print(",");
			        }
			    }
			}
		}
	}

}
