package java_fundamentals;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
		}
		for(int i=10;i<=99;i++) {
			boolean p=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					p=false;
				}
			}
			if(p) {
				System.out.println(i);
		    }
		}
	}

}
