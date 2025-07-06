package java_fundamentals;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s=sc.nextLine();
			int age=sc.nextInt();
			if(s.equals("Female") && (age >=1 && age<=58)) {
				System.out.println("The percentage of interest is 8.2%");
			}else if(s.equals("Female") && (age >=59 && age<=100)) {
				System.out.println("The percentage of interest is 9.2%");
			}else if(s.equals("Male") && (age >=1 && age<=58)) {
				System.out.println("The percentage of interest is 8.4%");
			}else if(s.equals("Male") && (age >=59 && age<=100)) {
				System.out.println("The percentage of interest is 10.5%");
			}
		}
	}

}
